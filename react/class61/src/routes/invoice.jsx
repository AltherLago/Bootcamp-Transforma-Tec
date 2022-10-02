import {
  useParams,
  useNavigate,
  useLocation
} from 'react-router-dom'

import { getInvoice, deleteInvoice } from '../data'

export default function Invoice(){

    let navigate = useNavigate()
    let location = useLocation()
    let params = useParams()
    // transformando a String em número
    let invoice = getInvoice(parseInt(params.invoiceId,10))

    return(
       <main>
           <h2> Total value: {invoice.amount}</h2>
           <p>
               {invoice.name} : {invoice.number}
           </p>
           <p>
               Due date: {invoice.due}
           </p>
           <p>
               <button
                   onClick={
                       () => {
                           deleteInvoice(invoice.number)
                           navigate('/invoices' + location.search)
                       }
                   }
               >
                   Delete
               </button>
           </p>
       </main>

    )
}


