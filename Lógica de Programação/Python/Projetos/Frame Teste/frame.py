from tkinter import *


def result():
    label.config(text="Atividade Concluída",
                 font=("JetBrains",16,"bold"))


frame = Tk()

frame.geometry("400x140")
frame.title("Frame Teste Python")


label = Label(frame,
              text="Frame teste",
              font=("JetBrains",16,"bold"),
              )
label.pack()
button = Button(frame,
                text="Concluir",
                font=("JetBrains",20,"bold"),
                )
button.config(command=result)
button.pack()

frame.mainloop()
