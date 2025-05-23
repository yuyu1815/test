/*    */ package org.jetbrains.jewel.foundation.lazy.tree;
/*    */ 
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */ public final class DefaultImpls
/*    */ {
/*    */   @NotNull
/*    */   public static <T> List<Tree.Element<T>> path(@NotNull Tree.Element $this) {
/* 44 */     List<Tree.Element> list1 = CollectionsKt.createListBuilder(), $this$path_u24lambda_u240 = list1; int $i$a$-buildList-Tree$Element$path$1 = 0;
/* 45 */     Tree.Element next = $this;
/* 46 */     while (next != null) {
/* 47 */       $this$path_u24lambda_u240.add(next);
/* 48 */       next = next.getParent();
/*    */     } 
/*    */     
/* 51 */     return CollectionsKt.reversed(CollectionsKt.build(list1)); } @NotNull
/*    */   public static <T> Iterable<Tree.Element<T>> previousElementsIterable(@NotNull Tree.Element $this) {
/* 53 */     return new Tree$Element$DefaultImpls$previousElementsIterable$$inlined$Iterable$1($this);
/*    */   }
/*    */   @NotNull
/*    */   public static <T> Iterable<Tree.Element<T>> nextElementsIterable(@NotNull Tree.Element $this) {
/* 57 */     return new Tree$Element$DefaultImpls$nextElementsIterable$$inlined$Iterable$1($this);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\tree\Tree$Element$DefaultImpls.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */