import {createBrowserRouter, RouterProvider} from 'react-router-dom'
import './App.css'
import About from './pages/Aboutr';
import Home from './pages/Home';
import ArticlesList from './pages/ArticlesList';

const routes = [{
  path : '/',
  element: <Home/>
},
{
  path: '/about',
  element: <About/>
},
{
  path: '/articles',
  element: <ArticlesList/>
},
{
  path: '/*',
  element: <Error/>
}

]

const routeur = createBrowserRouter(routes) 

function App() {
  

  return (
   <RouterProvider router={routeur}/>
  );
}

export default App
