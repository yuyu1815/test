/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import java.util.Iterator;
/*     */ import java.util.NoSuchElementException;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.TuplesKt;
/*     */ import kotlin.collections.ArrayDeque;
/*     */ import kotlin.jvm.internal.markers.KMappedMarker;
/*     */ import kotlin.sequences.Sequence;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\025\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020(\n\000*\001\000\b\n\030\0002\b\022\004\022\0020\0020\001J\017\020\003\032\b\022\004\022\0020\0020\004H\002¨\006\005"}, d2 = {"com/intellij/ml/llm/matterhorn/ProjectFileStructureKt$walk$1", "Lkotlin/sequences/Sequence;", "Lcom/intellij/ml/llm/matterhorn/ProjectStructureItem;", "iterator", "", "core"})
/*     */ public final class ProjectFileStructureKt$walk$1
/*     */   implements Sequence<ProjectStructureItem>
/*     */ {
/*     */   ProjectFileStructureKt$walk$1(ProjectStructureFolder $receiver) {}
/*     */   
/*     */   public Iterator<ProjectStructureItem> iterator() {
/* 479 */     return new ProjectFileStructureKt$walk$1$iterator$1(this.$this_walk); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020(\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\002\b\004*\001\000\b\n\030\0002\b\022\004\022\0020\0020\001J\n\020\b\032\004\030\0010\002H\002J\t\020\t\032\0020\007H\002J\t\020\n\032\0020\002H\002R(\020\003\032\034\022\030\022\026\022\004\022\0020\002\022\f\022\n\022\004\022\0020\002\030\0010\0010\0050\004X\004¢\006\002\n\000R\016\020\006\032\0020\007X\016¢\006\002\n\000¨\006\013"}, d2 = {"com/intellij/ml/llm/matterhorn/ProjectFileStructureKt$walk$1$iterator$1", "", "Lcom/intellij/ml/llm/matterhorn/ProjectStructureItem;", "stack", "Lkotlin/collections/ArrayDeque;", "Lkotlin/Pair;", "isReady", "", "fetchOrNull", "hasNext", "next", "core"})
/* 480 */   public static final class ProjectFileStructureKt$walk$1$iterator$1 implements Iterator<ProjectStructureItem>, KMappedMarker { private final ArrayDeque<Pair<ProjectStructureItem, Iterator<ProjectStructureItem>>> stack; ProjectFileStructureKt$walk$1$iterator$1(ProjectStructureFolder $receiver) { this.stack = new ArrayDeque();
/* 481 */       this.isReady = true;
/*     */ 
/*     */       
/* 484 */       this.stack.addLast(TuplesKt.to($receiver, $receiver.getChildren().iterator())); }
/*     */      private boolean isReady;
/*     */     private final ProjectStructureItem fetchOrNull() {
/*     */       Iterator<ProjectStructureItem> content;
/* 488 */       if (this.isReady) {
/* 489 */         (Pair)this.stack.lastOrNull(); return ((Pair)this.stack.lastOrNull() != null) ? (ProjectStructureItem)((Pair)this.stack.lastOrNull()).getFirst() : null;
/*     */       } 
/*     */       while (true) {
/* 492 */         Pair entry = (Pair)this.stack.lastOrNull();
/* 493 */         if (entry == null) {
/* 494 */           this.isReady = true;
/* 495 */           return null;
/*     */         } 
/*     */         
/* 498 */         content = (Iterator)entry.getSecond();
/* 499 */         if (content == null || !content.hasNext()) {
/* 500 */           this.stack.removeLast(); continue;
/*     */         } 
/*     */         break;
/*     */       } 
/* 504 */       ProjectStructureItem nextItem = content.next();
/* 505 */       ((nextItem instanceof ProjectStructureFolder) ? nextItem : null).getChildren(); this.stack.addLast(TuplesKt.to(nextItem, (((nextItem instanceof ProjectStructureFolder) ? nextItem : null) != null && ((nextItem instanceof ProjectStructureFolder) ? nextItem : null).getChildren() != null) ? ((nextItem instanceof ProjectStructureFolder) ? nextItem : null).getChildren().iterator() : null));
/* 506 */       this.isReady = true;
/* 507 */       return nextItem;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean hasNext() {
/* 512 */       return (fetchOrNull() != null);
/*     */     }
/*     */     public ProjectStructureItem next() {
/*     */       ProjectStructureItem value;
/* 516 */       if (fetchOrNull() == null) { fetchOrNull(); throw new NoSuchElementException(); }
/* 517 */        this.isReady = false;
/* 518 */       return value;
/*     */     }
/*     */     
/*     */     public void remove() {
/*     */       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ProjectFileStructureKt$walk$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */