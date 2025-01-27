import { BrowserRouter,Routes,Route } from 'react-router-dom';
import React from 'react';
import Navbar from './navbar/Navbar';
import Footer from './navbar/Footer';
import Notfound from './pages/Notfound';
import ListUsers from './pages/ListUsers';
import ListUsers2 from './pages/ListUsers2';
import HomePage from './pages/HomePage';
import Inscription from './pages/Inscription';
import Modification from './pages/Modification';
import Supression from './pages/Supression';

function App() {
  return (
    <BrowserRouter>
      <Navbar/>
      <div>
        <Routes>
        <Route path='/' element={<HomePage/>}/>
        <Route path='/users1' element={<ListUsers/>}/>
        <Route path='/users2' element={<ListUsers2/>}/>
        <Route path='/options/1' element={<Inscription/>}/>
        <Route path='/options/2' element={<Modification/>}/>
        <Route path='/options/3' element={<Supression/>}/>
        <Route path='*' element={<Notfound/>}/>
        </Routes>

      </div>
      <Footer/>
    </BrowserRouter>
  );
}

export default App;