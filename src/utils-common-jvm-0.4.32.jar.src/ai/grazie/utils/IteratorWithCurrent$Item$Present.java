/*    */ package ai.grazie.utils;
/*    */ 
/*    */ import kotlin.Metadata;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\016\n\002\030\002\n\000\n\002\030\002\n\002\b\006\030\000*\004\b\002\020\0012\b\022\004\022\002H\0010\002B\r\022\006\020\003\032\0028\002¢\006\002\020\004R\023\020\003\032\0028\002¢\006\n\n\002\020\007\032\004\b\005\020\006¨\006\b"}, d2 = {"Lai/grazie/utils/IteratorWithCurrent$Item$Present;", "T", "Lai/grazie/utils/IteratorWithCurrent$Item;", "item", "(Ljava/lang/Object;)V", "getItem", "()Ljava/lang/Object;", "Ljava/lang/Object;", "utils-common"})
/*    */ public final class Present<T>
/*    */   implements IteratorWithCurrent.Item<T>
/*    */ {
/*    */   private final T item;
/*    */   
/*    */   public Present(Object item) {
/* 81 */     this.item = (T)item; } public final T getItem() { return this.item; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\IteratorWithCurrent$Item$Present.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */