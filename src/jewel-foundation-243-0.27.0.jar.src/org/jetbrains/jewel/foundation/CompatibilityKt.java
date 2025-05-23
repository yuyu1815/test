/*    */ package org.jetbrains.jewel.foundation;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\032\b\020\000\032\0020\001H\007¨\006\002"}, d2 = {"enableNewSwingCompositing", "", "foundation"})
/*    */ public final class CompatibilityKt
/*    */ {
/*    */   @ExperimentalJewelApi
/*    */   public static final void enableNewSwingCompositing() {
/* 13 */     System.setProperty("compose.swing.render.on.graphics", "true");
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\CompatibilityKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */