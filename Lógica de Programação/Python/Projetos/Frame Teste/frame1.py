import customtkinter

root = customtkinter.CTk()
root.geometry("250x300")
root.title("Sistema de Lavação")

frame1 = customtkinter.CTkFrame(master=root)
frame1.pack(padx = 20, pady = 12, fill = "both", expand = True)

frame2 = customtkinter.CTkFrame(master=root)
frame1.pack(padx = 20, pady = 12, fill = "both", expand = True)

label1 = customtkinter.CTkLabel(master=frame1, text="Qual o seu nome:", font=('Roboto', 18))
label1.pack(padx = 10, pady = 10)

input1 = customtkinter.CTkEntry(master=frame1, placeholder_text="Seu nome aqui...")
input1.pack(padx = 10, pady = 10)

button1 = customtkinter.CTkButton(master=frame1, text="Enviar")
button1.pack(padx = 10, pady = 10)

root.mainloop()