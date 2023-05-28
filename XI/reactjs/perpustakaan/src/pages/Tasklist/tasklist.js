// Import react agar menggunakan libary useState yang bisa menampung sebuah data
import React, { useState } from "react";

// Membuat function Tasklist / Todolist / atau apapun yang kalian mau
function Tasklist() {

    // Array Simpan Todolist
    const [todos, setTodos] = useState([]);

    const [edit, setEdit] = useState(false);

    //State untuk inputan / Form
    const [newTask, setNewTask] = useState("");

    //Fungsi untuk menambahkan todolist
    const handleAdd = (event) => {
        // Event prevent default adalah untuk menghindari reload saat submit
        event.preventDefault();
        if (newTask) {
            // Membuat object baru untuk ditambahkan ke array todos
            const newTodo = {
                id: todos.length + 1,
                task: newTask,
                state: "In Progress",
                status: false
            };
            // Menambahkan object baru ke array todos
            setTodos([...todos, newTodo]);
            // Mengosongkan inputan setelah submit
            setNewTask("");
        }
    };

    // buatkan fungsi untuk mengedit task dan ditampilkan diinput form
    const handleEdit = (id) => {
        setEdit(true);
        const updatedTodos = todos.map((todo) =>
            // arti dalam kode dibawah adalah jika todo.id sama dengan id yang dikirimkan maka akan mengembalikan object baru yang berisi todo.task, todo.status, dan todo.state yang baru
            todo.id === id ? { ...todo, task: newTask } : todo
        );
        // Setelah object baru dibuat maka akan mengupdate array todos
        setTodos(updatedTodos);
    };

    //Fungsi untuk mengubah status todolist
    const handleUpdateStatus = (id, newStatus, state) => {
        const updatedTodos = todos.map((todo) =>
            // arti dalam kode dibawah adalah jika todo.id sama dengan id yang dikirimkan maka akan mengembalikan object baru yang berisi todo.task, todo.status, dan todo.state yang baru
            todo.id === id ? { ...todo, status: newStatus, state: state } : todo
        );
        // Setelah object baru dibuat maka akan mengupdate array todos
        setTodos(updatedTodos);
    };

    //Fungsi untuk menghapus todolist
    const handleDelete = (id) => {
        // Filter adalah fungsi yang akan mengembalikan array baru yang sudah difilter
        const updatedTodos = todos.filter((todo) => todo.id !== id);
        // Setelah array baru dibuat maka akan mengupdate array todos
        setTodos(updatedTodos);
    };


    return (
        <div class="vh-100">
            <div class="container py-5 pb-5">
                <div class="row d-flex justify-content-center align-items-center h-100">
                    <section class="card shadow bg-body-tertiary rounded">
                        <div class="container-fluid">
                            <div class="row">
                                <div class="col-12">
                                    <h1 class="text-center mt-5">✅To-do-list</h1>
                                </div>
                            </div>
                            <div class="row justify-content-center mt-4">
                                <div class="col-10">
                                    <div class="">
                                        {/* Form Input Kondisi onSubmit akan melakukan const handleAdd */}
                                        <form onSubmit={handleAdd}>
                                            <div class="d-flex flex-row align-items-center">
                                                <input type="text" class="form-control form-control-lg" id="exampleFormControlInput1" placeholder="Buat Todolist" value={newTask} onChange={(event) => setNewTask(event.target.value)} />
                                                <a href="#!" data-mdb-toggle="tooltip" title="Set due date"><i
                                                    class="fas fa-calendar-alt fa-lg me-3"></i></a>
                                                <div>
                                                    <button type="submit" class="btn btn-primary">Add</button>
                                                </div>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                            {/* Table row untuk menampilkan array dari todos */}
                            <div class="row justify-content-center">
                                <div class="col-10">
                                    <table class="table mt-4 mb-4 text-center">
                                        <thead>
                                            <tr>
                                                {/* Table Header */}
                                                <th scope="col">No.</th>
                                                <th scope="col">Todo item</th>
                                                <th scope="col">Status</th>
                                                <th scope="col">Actions</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            {/* Maping array agar bisa dibuat menjadi table */}
                                            {/* Item adalah variable yang menampung array yang sudah dimapping agar bisa ditampilkan didalam table row */}
                                            {todos.map((item, index) => (
                                                <tr>
                                                    <th scope="row">{item.id}</th>
                                                    <td>{item.task}</td>
                                                    {item.state == "In Progress" ? (<td class="text-warning fw-bold">{item.state}</td>) : (<td class="text-success fw-bold">{item.state}</td>)}
                                                    <td>
                                                        {/* button yang berisi kondisi handleUpdateStatus dan berisi parameter yang telah ditentukan  */}
                                                        <button onClick={() => handleUpdateStatus(item.id, true, "Done")} type="submit" class="btn btn-success ms-1" hidden={item.status}>Selesai</button>
                                                        {/* button yang berisi kondisi handleDelete dan berisi parameter id dari array yang akan dihapus */}
                                                        <button onClick={() => handleDelete(item.id)} type="submit" class="mx-3 btn btn-danger">Hapus</button>
                                                    </td>
                                                </tr>
                                            ))}
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </section>
                </div>
            </div>
        </div>
    );
}

// Export agar bisa digunakan di file lain dan ditampilkan diapp.js
export default Tasklist;