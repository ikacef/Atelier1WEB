import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import {BrowserRouter, Route,Routes} from "react-router-dom";
import NotFound from "./pages/NotFound.jsx";
import CustomersList from "./pages/CustomersList.jsx";
import CreateCustomer from "./pages/CreateCustomer.jsx";

function App() {
  return (
    <BrowserRouter>
        <div>
            <Routes>
                <Route path="*" element={<NotFound/>}/>
                <Route path="/listC" element={<CustomersList/>}/>
                <Route path="/" element={<CreateCustomer/>}/>
            </Routes>
        </div>
    </BrowserRouter>
  )
}

export default App
