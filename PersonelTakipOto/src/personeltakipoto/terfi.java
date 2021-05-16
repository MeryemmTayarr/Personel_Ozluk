
package personeltakipoto;

public class terfi {

    private int terfiid;
    private String terfiTipi;

    public terfi(int terfiid, String terfiTipi) {
        this.terfiid = terfiid;
        this.terfiTipi = terfiTipi;
    }
    
    public terfi()
    {
    }

    /**
     * @return the terfiid
     */
    public int getTerfiid() {
        return terfiid;
    }

    /**
     * @param terfiid the terfiid to set
     */
    public void setTerfiid(int terfiid) {
        this.terfiid = terfiid;
    }

    /**
     * @return the terfiTipi
     */
    public String getTerfiTipi() {
        return terfiTipi;
    }

    /**
     * @param terfiTipi the terfiTipi to set
     */
    public void setTerfiTipi(String terfiTipi) {
        this.terfiTipi = terfiTipi;
    }
    
    
    
}
