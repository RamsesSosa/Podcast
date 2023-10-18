package mx.itson.podcast.ui;


import mx.itson.podcast.s.Comments;
import mx.itson.podcast.s.Post;
import mx.itson.podcast.s.User;
import mx.itson.podcast.enums.Category;

/**
 *
 * @author javier
 */
public class Podcast {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        User user = new User ();
        user.setName("Ramsés Villegas Sosa");
        user.setEmail("sosaramses08@gmail.com");
        user.setNumber("6221554390"); 
        user.setPassword("sosaxd");
        
        Comments comments = new Comments ();
        comments.setComment("Me parece muy acertado tu post.");
        comments.setDislike(2);
        comments.setLike(101);
        comments.setWords(24);
        
         Post post = new Post ();
         post.setAutor("@ramsessosa");
         post.setCategory(Category.COMIC);
         post.setComments(89);
         post.setDate("17/05/22");
         post.setDescripcion("IOS es mejor que android");
         post.setDislike(13);
         post.setLike(101);
         post.setPhoto("");
         post.setAnswer("9");
         
         System.out.println(user.getName());
         System.out.println(user.getEmail());
         System.out.println(user.getNumber());
         System.out.println(user.getPassword());
         
         System.out.println("-----------------------------------------");
         System.out.println("Fecha: "+post.getDate());
         System.out.println("Descripcion: "+post.getDescripcion());
         System.out.println("/"
                 + "/"
                 + "/"
                 + "/"
                 + "/"
                 + "/"
                 + "/");
         
         System.out.println("Dislikes: "+post.getDislike());
         System.out.println("Likes: "+post.getLike());
         System.out.println("Categoria: "+post.getCategory());
         System.out.println("Autor: "+post.getAutor());

         System.out.println("-----------------------------------------");
         


         System.out.println("Comentarios: "+post.getComments());
         System.out.println("Respuesta: "+comments.getComment());
         System.out.println("Caracteres:"+comments.getWords());
         System.out.println("Dislikes: "+comments.getDislike());
         System.out.println("Likes: "+comments.getLike());
         System.out.println(""+post.getPhoto());         
    }
    
}
