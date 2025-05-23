/*    */ package ai.grazie.model.cloud.ip;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.UByte;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\020\005\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "", "invoke"})
/*    */ final class IPv4Address$display$1
/*    */   extends Lambda
/*    */   implements Function1<Byte, CharSequence>
/*    */ {
/*    */   public static final IPv4Address$display$1 INSTANCE = new IPv4Address$display$1();
/*    */   
/*    */   IPv4Address$display$1() {
/*    */     super(1);
/*    */   }
/*    */   
/*    */   public final CharSequence invoke(byte it) {
/* 27 */     return UByte.toString-impl(UByte.constructor-impl(it));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\ip\IPv4Address$display$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */