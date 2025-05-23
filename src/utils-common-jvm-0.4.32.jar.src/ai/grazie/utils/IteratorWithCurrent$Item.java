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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\br\030\000*\006\b\001\020\001 \0012\0020\002:\002\003\004\001\002\005\006ø\001\000\002\006\n\004\b!0\001¨\006\007À\006\001"}, d2 = {"Lai/grazie/utils/IteratorWithCurrent$Item;", "T", "", "Absent", "Present", "Lai/grazie/utils/IteratorWithCurrent$Item$Absent;", "Lai/grazie/utils/IteratorWithCurrent$Item$Present;", "utils-common"})
/*    */ interface Item<T>
/*    */ {
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\016\n\002\030\002\n\000\n\002\030\002\n\002\b\006\030\000*\004\b\002\020\0012\b\022\004\022\002H\0010\002B\r\022\006\020\003\032\0028\002¢\006\002\020\004R\023\020\003\032\0028\002¢\006\n\n\002\020\007\032\004\b\005\020\006¨\006\b"}, d2 = {"Lai/grazie/utils/IteratorWithCurrent$Item$Present;", "T", "Lai/grazie/utils/IteratorWithCurrent$Item;", "item", "(Ljava/lang/Object;)V", "getItem", "()Ljava/lang/Object;", "Ljava/lang/Object;", "utils-common"})
/*    */   public static final class Present<T>
/*    */     implements Item<T>
/*    */   {
/*    */     private final T item;
/*    */     
/*    */     public Present(Object item) {
/* 81 */       this.item = (T)item; } public final T getItem() { return this.item; }
/*    */   
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\016\n\002\030\002\n\000\n\002\030\002\n\002\b\002\030\000*\004\b\002\020\0012\b\022\004\022\002H\0010\002B\005¢\006\002\020\003¨\006\004"}, d2 = {"Lai/grazie/utils/IteratorWithCurrent$Item$Absent;", "T", "Lai/grazie/utils/IteratorWithCurrent$Item;", "()V", "utils-common"})
/*    */   public static final class Absent<T> implements Item<T> {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\IteratorWithCurrent$Item.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */