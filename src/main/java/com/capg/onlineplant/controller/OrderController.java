package com.capg.onlineplant.controller;


	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	import com.capg.onlineplant.entity.Order;
	import com.capg.onlineplant.exception.OrderIdNotFoundException;
	import com.capg.onlineplant.service.OrderService;

	@RestController
	@RequestMapping(value = "orders")
	@CrossOrigin("http://localhost:4200")
	public class OrderController {	

		@Autowired
	    OrderService orderService;

		@PostMapping(path="/addorder")
		public ResponseEntity<Order> addOrder(@RequestBody Order order) {
			orderService.addOrder(order);
			return new ResponseEntity<Order>(order, HttpStatus.CREATED);
		}
		
		@PutMapping({"/updateorder"})
		public ResponseEntity<Order> updateOrdter(@RequestBody Order order , @PathVariable int orderId) {
			// logger.trace("updating the whole plant having id "+ id);  
			orderService.updateOrder(order);
			return new ResponseEntity<Order>(order, HttpStatus.ACCEPTED);
		}

		@DeleteMapping("/deleteorder")
		public ResponseEntity<Order> deleteOrder(@PathVariable int orderId) throws OrderIdNotFoundException{
			//logger.trace("deleting the whole plant");	
			return new ResponseEntity<Order>(orderService.deleteOrder(orderId), HttpStatus.OK);
		}

		@GetMapping(path="/addorders")
		public ResponseEntity<List<Order>> viewAllOrders() {
			//logger.trace("fetching all the plants");
			List<Order> list = orderService.viewAllOrders();
			return new ResponseEntity<List<Order>>(list, HttpStatus.OK);
		}

		@GetMapping(path="/addorders/orderId/{orderId}")
		public ResponseEntity<List<Order>> viewAllOrders(@PathVariable int OrderId) {
			//logger.trace("searching the plants of type "+typeOfPlant);
			List<Order> list = orderService.viewAllOrders();
			return new ResponseEntity<List<Order>>(list,HttpStatus.OK);
		}
	}