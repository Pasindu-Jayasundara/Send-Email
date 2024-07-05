# Send Email
Developed for sending emails

#### Features
1) Send Emails

#### Methods
1) >.send(from, fromAppPassword, to, subject, body);

#### How to Use
1) Download the 3 .jar files and add it to your project
2) Import Library:
   
   ```java
   
   import com.Email;
   
   ```

3) Use Methods: </br></br>
    i) .send(from, fromAppPassword, to, subject, body) </br>
    > This method is used to send the email. </br></br>
    > from -> sender's email address</br>
    > fromAppPassword -> app password generated from sender's email address</br>
    > to -> receiver's email address</br>
    > subject -> subject of the email</br>
    > body -> body content of the email </br>
    
   ```java
   
   try {
       Email.send(from, fromAppPassword, to, subject, body);
   } catch (Exception e) {
       e.printStackTrace();
   }
   
   ```

#### Example Code:

```java

import com.Email;

public class B {

    public static void main(String[] args) {
        try {
            Email.send(from, fromAppPassword, to, subject, body);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

```
 

