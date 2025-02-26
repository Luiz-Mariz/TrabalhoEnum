package aplication.entities;

import aplication.enums.OrderStatus;

import java.util.Date;

public class Order {
    private Integer id;
    private OrderStatus status;
    private Date moment;

    public Order() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public boolean resposta() {
        return (status == OrderStatus.PENDING_PAYMET);
    }

    public void showResult(Boolean resultadoPedido, OrderStatus os1) {
        if (resultadoPedido) {
            System.out.println("Status do pedido: " + os1);
            setStatus(OrderStatus.SHIPPED);
            System.out.println("Status do pedido: " + getStatus());
            setStatus(OrderStatus.DELIVERED);
            System.out.println("Status do pedido: " + getStatus());
        }
        else {
            System.out.println("Tente outro produto");
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", status=" + status +
                ", moment=" + moment +
                '}';
    }
}
