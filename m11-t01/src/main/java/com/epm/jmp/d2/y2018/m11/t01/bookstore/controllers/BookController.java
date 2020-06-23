package com.epm.jmp.d2.y2018.m11.t01.bookstore.controllers;

import com.epm.jmp.d2.y2018.m11.t01.bookstore.model.Book;
import com.epm.jmp.d2.y2018.m11.t01.bookstore.model.OrderItem;
import com.epm.jmp.d2.y2018.m11.t01.bookstore.service.BookService;
import com.epm.jmp.d2.y2018.m11.t01.bookstore.service.OrderService;
import com.epm.jmp.d2.y2018.m11.t01.bookstore.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("orderService")
public class BookController {

    @Autowired
    private BookService bookService;

    @ModelAttribute
    public OrderService getOrderService() {
        return new OrderServiceImpl();
    }

    @RequestMapping("/")
    public ModelAndView gotoBookListPage(
            @ModelAttribute("orderService") OrderService orderService) {
        ModelAndView modelAndView =
                new ModelAndView("book_list", "books", bookService.getBookList());
        modelAndView.addObject("orderItems", orderService.getOrderItems());
        modelAndView.addObject("orderItemsCount", orderService.getOrderItems().size());
        modelAndView.addObject("totalPrice", orderService.getTotalPrice());
        modelAndView.addObject("orderService", orderService);
        return modelAndView;
    }

    @RequestMapping("/bookDetail/{id}")
    public String gotoBookDetailPage(@PathVariable("id") int id,
                                     @ModelAttribute("orderService") OrderService orderService, Model model) {
        Book book = bookService.getBookById(id);
        model.addAttribute("book", book);
        model.addAttribute("orderItems", orderService.getOrderItems());
        model.addAttribute("orderItemsCount", orderService.getOrderItems().size());
        model.addAttribute("orderService", orderService);

        for (OrderItem orderItem : orderService.getOrderItems()) {
            if (orderItem.getStoreItem().equals(book))
                model.addAttribute("inCart", true);
        }
        return "book_detail";
    }

    @RequestMapping(path = "/bookDetail/{id}/AddToCart", params = {"qty"})
    public String addToCart(@PathVariable("id") int id, @RequestParam("qty") int qty, Model model,
                            @ModelAttribute("orderService") OrderService orderService) {
        Book book = bookService.getBookById(id);
        orderService.addOrderItem(book, qty);
        model.addAttribute("book", book);
        model.addAttribute("orderItems", orderService.getOrderItems());
        model.addAttribute("orderItemsCount", orderService.getOrderItems().size());
        model.addAttribute("orderService", orderService);
        return "book_detail";
    }

    @RequestMapping("/shopping_cart")
    public String gotoShoppingCart(@ModelAttribute("orderService") OrderService orderService,
                                   Model model) {
        model.addAttribute("orderItems", orderService.getOrderItems());
        model.addAttribute("totalPrice", orderService.getTotalPrice());
        return "shopping_cart";
    }

    @RequestMapping(path = "/shopping_cart/book/{id}/updateQty", params = {"qty"})
    public String shoppingCartBookUpdateQty(@PathVariable("id") int id,
                                            @RequestParam("qty") int qty, @ModelAttribute("orderService") OrderService orderService,
                                            Model model) {
        Book book = bookService.getBookById(id);
        orderService.updateOrderItemQty(book, qty);
        model.addAttribute("orderItems", orderService.getOrderItems());
        model.addAttribute("totalPrice", orderService.getTotalPrice());
        model.addAttribute("orderService", orderService);
        return "shopping_cart";
    }

    @RequestMapping("/shopping_cart/book/{id}/remove")
    public String shoppingCartBookRemove(@PathVariable("id") int id,
                                         @ModelAttribute("orderService") OrderService orderService, Model model) {
        orderService.removeOrderItem(bookService.getBookById(id));
        model.addAttribute("orderItems", orderService.getOrderItems());
        model.addAttribute("totalPrice", orderService.getTotalPrice());
        model.addAttribute("orderService", orderService);
        return "shopping_cart";
    }

}
