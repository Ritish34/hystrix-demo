package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImp implements ContactService{

    //fake
    List<Contact> list = List.of(
            new Contact(1L,"raj@gmail.com","Raj",1311L),
            new Contact(2L,"karan@gmail.com","Karan",1312L),
            new Contact(3L,"anil@gmail.com","Anil",1314L)
    );

    @Override
    public List<Contact> getContactofUser(Long id) {
        return list.stream().filter(contact -> contact.getUserId().equals(id)).collect(Collectors.toList());
    }
}
