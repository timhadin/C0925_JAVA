class Resource implements AutoCloseable {
    public Resource() {
        System.out.println("Resource created");
    }

    public void use() {
        System.out.println("Resource is being used");
    }

    public void close() {
        System.out.println("Resource released");
    }
}

//public class H0925_9 {
//    public static void main(String[] args) {
//        Resource resource = new Resource();
//        try {
//            resource.use();
//        } finally {
//            resource.close();
//        }
//    }
//}

public class H0925_9 {
    public static void main(String[] args) {
        try (Resource resource = new Resource()) {
            resource.use();
        }
    }
}