package com.capgemini.onlinesweetshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.onlinesweetshop.entity.Cart;
import com.capgemini.onlinesweetshop.repository.CartRepository;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;

    public Cart GetCart(long id) {
        return cartRepository.findById(id).get();
    }

    public List<Cart> GetAllCart() {
        return cartRepository.findAll();
    }

    public String DeleteCart(long id) {
        cartRepository.deleteById(id);
        return "cartitem deleted successfully";
    }

    public void Addcart(Cart cart) {
        cartRepository.save(cart);
    }
    public String UpdateCart(long id, Cart cart) {
        
        cart.setCartId(id);
        cartRepository.save(cart);
        return "Cart updated successfully";
    }
    
}
