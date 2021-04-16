package restaurantetocomfome

class ItemPedido {
    int quantidade
    Double valorVenda
    String observacao

    Produto produto
    Pedido pedido

    static belongsTo = [Pedido]

    static mapping = {
        produto column: "id_produto"
        pedido column: "id_pedido"
    }


    static constraints = {
        quantidade min: 0
        valorVenda min: new Double(0)
        observacao nullable: true, blank: true
    }
}