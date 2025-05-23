/*    */ package ai.grazie.utils.mpp;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\004\n\002\b\006\032!\020\000\032\002H\001\"\004\b\000\020\0012\006\020\002\032\002H\0012\006\020\003\032\002H\001¢\006\002\020\004¨\006\005"}, d2 = {"forPlatform", "T", "js", "jvm", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "utils-common"})
/*    */ public final class PlatformKt
/*    */ {
/*    */   public static final <T> T forPlatform(Object js, Object jvm) {
/* 13 */     switch (WhenMappings.$EnumSwitchMapping$0[Platform.Companion.getCurrent().ordinal()]) { case 1: 
/*    */       case 2:
/* 15 */        }  throw new IllegalStateException(
/* 16 */         "Unexpected platform".toString());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\PlatformKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */