## Servlets
* **Servlet**  technology is used to create a web application (resides at server side and generates a dynamic web page).

* **Servlet**  technology is robust and scalable because of java language.

### What is a Servlet?
Servlet can be described in many ways, depending on the context.
-   A **servlet** is a Java programming language class that is used to extend the capabilities of servers that host applications accessed by means of a request-response programming model.
-   Servlet is an API that provides many interfaces and classes including documentation.
-   Servlet is an interface that must be implemented for creating any Servlet.
-   Servlet is a class that extends the capabilities of the servers and responds to the incoming requests. It can respond to any requests.
-   Servlet is a web component that is deployed on the server to create a dynamic web page.
####  Advantages of Servlet
There are many advantages of Servlet over CGI. The web container creates threads for handling the multiple requests to the Servlet. Threads have many benefits over the Processes such as they share a common memory area, lightweight, cost of communication between the threads are low. The advantages of Servlet are as follows:

1.  **Better performance:**  because it creates a thread for each request, not process.
2.  **Portability:**  because it uses Java language.
3.  **Robust:**  [JVM](https://www.javatpoint.com/jvm-java-virtual-machine)  manages Servlets, so we don't need to worry about the memory leak,  [garbage collection](https://www.javatpoint.com/Garbage-Collection), etc.
4.  **Secure:**  because it uses java language.

#### Servlet Lifecycle
The web container maintains the life cycle of a servlet instance. Let's see the life cycle of the servlet:
1.  Servlet class is loaded.
2.  Servlet instance is created.
3.  init() method is invoked.
4.  service() method is invoked.
5.  destroy() method is invoked.
