import axios from 'axios';
import React,{useState,useEffect} from 'react';
function ListUsers() {

    const[tabUsers, setTabUsers] = useState([])
    
    useEffect(() =>{
        axios.get("https://jsonplaceholder.typicode.com/users")
        .then(res => setTabUsers(res.data))
        .catch(err => console.log(err))

    },[]);

    const[tabUsers2, setTabUsers2] = useState([])
    
    useEffect(() =>{
        fetch("https://jsonplaceholder.typicode.com/users")
        .then(res => setTabUsers2(res.data))
        .catch(err => console.log(err))

    },[]);

    return (
        <div>
            <h1>USers1</h1>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Name</th>
                        <th scope="col">Username</th>
                        <th scope="col">email</th>
                        <th scope="col">City</th>
                        <th scope="col">Longitude</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        tabUsers.map((data, i) => (
                            <tr key={i}>
                            <th scope="row">{data.id}</th>
                            <td>{data.name}</td>
                            <td>{data.username}</td>
                            <td>{data.email}</td>
                            <td>{data.address.city}</td>
                            <td>{data.address.geo.lng}</td>
                            </tr>
                        ))
                       
                    }
                    
                </tbody>
            </table>
        </div>
    );
}

export default ListUsers;