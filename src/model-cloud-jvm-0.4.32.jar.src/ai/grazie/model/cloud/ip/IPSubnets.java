/*   */ package ai.grazie.model.cloud.ip;@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\"\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\027\020\003\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lai/grazie/model/cloud/ip/IPSubnets;", "", "()V", "localhost", "", "Lai/grazie/model/cloud/ip/IPAddress;", "getLocalhost", "()Ljava/util/Set;", "model-cloud"})
/*   */ public final class IPSubnets {
/*   */   @NotNull
/* 4 */   public static final IPSubnets INSTANCE = new IPSubnets(); @NotNull private static final Set<IPAddress> localhost; @NotNull public final Set<IPAddress> getLocalhost() { return localhost; } static { IPAddress[] arrayOfIPAddress = new IPAddress[2]; arrayOfIPAddress[0] = IPv4Address.Companion.parse("localhost"); arrayOfIPAddress[1] = IPv6Address.Companion.parse("0:0:0:0:0:0:0:1"); localhost = SetsKt.setOf((Object[])arrayOfIPAddress); }
/*   */ 
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\ip\IPSubnets.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */