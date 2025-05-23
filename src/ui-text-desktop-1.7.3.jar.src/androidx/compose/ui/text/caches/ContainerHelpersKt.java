/*    */ package androidx.compose.ui.text.caches;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\034\n\000\n\002\020\025\n\000\n\002\020\021\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\003\032\034\020\006\032\0020\007*\0020\0012\006\020\b\032\0020\0072\006\020\t\032\0020\007H\000\"\020\020\000\032\0020\0018\000X\004¢\006\002\n\000\"\032\020\002\032\n\022\006\022\004\030\0010\0040\0038\000X\004¢\006\004\n\002\020\005¨\006\n"}, d2 = {"EMPTY_INTS", "", "EMPTY_OBJECTS", "", "", "[Ljava/lang/Object;", "binarySearchInternal", "", "size", "value", "ui-text"})
/*    */ public final class ContainerHelpersKt
/*    */ {
/*    */   @JvmField
/*    */   @NotNull
/* 23 */   public static final int[] EMPTY_INTS = new int[0];
/*    */ 
/*    */ 
/*    */   
/*    */   @JvmField
/*    */   @NotNull
/* 29 */   public static final Object[] EMPTY_OBJECTS = new Object[0];
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final int binarySearchInternal(@NotNull int[] $this$binarySearchInternal, int size, int value) {
/* 35 */     Intrinsics.checkNotNullParameter($this$binarySearchInternal, "<this>"); int lo = 0;
/* 36 */     int hi = size - 1;
/* 37 */     while (lo <= hi) {
/* 38 */       int mid = lo + hi >>> 1;
/* 39 */       int midVal = $this$binarySearchInternal[mid];
/* 40 */       if (midVal < value) {
/* 41 */         lo = mid + 1; continue;
/* 42 */       }  if (midVal > value) {
/* 43 */         hi = mid - 1; continue;
/*    */       } 
/* 45 */       return mid;
/*    */     } 
/*    */     
/* 48 */     return lo ^ 0xFFFFFFFF;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\caches\ContainerHelpersKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */