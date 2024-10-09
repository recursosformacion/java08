package anotaciones;

import java.lang.reflect.Method;

public class CommandListener
{
    @Command(name = "hola",
            args = "",
            desc = "Sé educado, saluda",
            showInHelp = false,
            aliases = {"hey"})
    public void hello(String[] args)
    {
        //Algún tipo de funcionalidad, a tu discreción.
    }
    @Command(name = "Adiós",
            args = "",
            desc = "",
            aliases = {"buena suerte"})
    public void fct(String[] args)
    {
         // Funcionalidad
    }
    @Command(name = "ayuda",
            args = "",
            desc = "Muestra una lista de comandos",
            aliases = {"help", "comandos"})
    public void help(String[] args)
    {
        StringBuilder sb = new StringBuilder("Lista de comandos: \n");
        for (Method m : this.getClass().getDeclaredMethods())
        {
            if (m.isAnnotationPresent(Command.class))
            {
                Command com = m.getAnnotation(Command.class);
                if (com.showInHelp()) //Si deseas mostrar un comando en la lista.
                {
                    sb.append("bot, ")
                       .append(com.name()).append(" ")
                       .append(com.args()).append(" - ")
                       .append(com.desc()).append("\n");
                }
            }
        }
        //Enviando sb.toString();
    }
}