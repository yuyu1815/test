/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.NoSuchElementException;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.TuplesKt;
/*     */ import kotlin.collections.ArrayDeque;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.markers.KMappedMarker;
/*     */ import kotlin.sequences.Sequence;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\036\n\000\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\032\022\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004\032\022\020\005\032\0020\001*\0020\0022\006\020\003\032\0020\004\032\020\020\006\032\b\022\004\022\0020\b0\007*\0020\002¨\006\t"}, d2 = {"visit", "", "Lcom/intellij/ml/llm/matterhorn/ProjectStructureFolder;", "visitor", "Lcom/intellij/ml/llm/matterhorn/ProjectStructureVisitor;", "visitChildren", "walk", "Lkotlin/sequences/Sequence;", "Lcom/intellij/ml/llm/matterhorn/ProjectStructureItem;", "core"})
/*     */ public final class ProjectFileStructureKt
/*     */ {
/*     */   public static final void visit(@NotNull ProjectStructureFolder $this$visit, @NotNull ProjectStructureVisitor visitor) {
/* 440 */     Intrinsics.checkNotNullParameter($this$visit, "<this>"); Intrinsics.checkNotNullParameter(visitor, "visitor"); if (visitor.enterFolder($this$visit)) {
/* 441 */       visitChildren($this$visit, visitor);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final void visitChildren(@NotNull ProjectStructureFolder $this$visitChildren, @NotNull ProjectStructureVisitor visitor) {
/* 449 */     Intrinsics.checkNotNullParameter($this$visitChildren, "<this>"); Intrinsics.checkNotNullParameter(visitor, "visitor"); ArrayDeque stack = new ArrayDeque();
/* 450 */     stack.addLast(TuplesKt.to($this$visitChildren, $this$visitChildren.getChildren().iterator()));
/* 451 */     while (!((Collection)stack).isEmpty()) {
/* 452 */       Pair entry = (Pair)stack.last();
/* 453 */       Iterator<ProjectStructureItem> content = (Iterator)entry.getSecond();
/* 454 */       while (content.hasNext()) {
/* 455 */         ProjectStructureItem nextItem = content.next();
/* 456 */         ProjectStructureItem projectStructureItem1 = nextItem;
/* 457 */         if (projectStructureItem1 instanceof ProjectStructureFolder) {
/* 458 */           if (visitor.enterFolder((ProjectStructureFolder)nextItem)) {
/* 459 */             stack.addLast(TuplesKt.to(nextItem, ((ProjectStructureFolder)nextItem).getChildren().iterator())); // Byte code: goto -> 37
/*     */           } 
/*     */           continue;
/*     */         } 
/* 463 */         if (projectStructureItem1 instanceof ProjectStructureFile) {
/* 464 */           visitor.visitFile((ProjectStructureFile)nextItem); continue;
/*     */         } 
/* 466 */         if (projectStructureItem1 instanceof ProjectStructureBinaryFile) {
/* 467 */           visitor.visitBinaryFile((ProjectStructureBinaryFile)nextItem);
/*     */         }
/*     */       } 
/*     */       
/* 471 */       visitor.exitFolder((ProjectStructureFolder)entry.getFirst());
/* 472 */       stack.removeLast();
/*     */     } 
/*     */   }
/*     */   
/*     */   @NotNull
/* 477 */   public static final Sequence<ProjectStructureItem> walk(@NotNull ProjectStructureFolder $this$walk) { Intrinsics.checkNotNullParameter($this$walk, "<this>"); return new ProjectFileStructureKt$walk$1($this$walk); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\025\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020(\n\000*\001\000\b\n\030\0002\b\022\004\022\0020\0020\001J\017\020\003\032\b\022\004\022\0020\0020\004H\002¨\006\005"}, d2 = {"com/intellij/ml/llm/matterhorn/ProjectFileStructureKt$walk$1", "Lkotlin/sequences/Sequence;", "Lcom/intellij/ml/llm/matterhorn/ProjectStructureItem;", "iterator", "", "core"})
/*     */   public static final class ProjectFileStructureKt$walk$1 implements Sequence<ProjectStructureItem> { ProjectFileStructureKt$walk$1(ProjectStructureFolder $receiver) {}
/* 479 */     public Iterator<ProjectStructureItem> iterator() { return new ProjectFileStructureKt$walk$1$iterator$1(this.$this_walk); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020(\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\002\b\004*\001\000\b\n\030\0002\b\022\004\022\0020\0020\001J\n\020\b\032\004\030\0010\002H\002J\t\020\t\032\0020\007H\002J\t\020\n\032\0020\002H\002R(\020\003\032\034\022\030\022\026\022\004\022\0020\002\022\f\022\n\022\004\022\0020\002\030\0010\0010\0050\004X\004¢\006\002\n\000R\016\020\006\032\0020\007X\016¢\006\002\n\000¨\006\013"}, d2 = {"com/intellij/ml/llm/matterhorn/ProjectFileStructureKt$walk$1$iterator$1", "", "Lcom/intellij/ml/llm/matterhorn/ProjectStructureItem;", "stack", "Lkotlin/collections/ArrayDeque;", "Lkotlin/Pair;", "isReady", "", "fetchOrNull", "hasNext", "next", "core"})
/* 480 */     public static final class ProjectFileStructureKt$walk$1$iterator$1 implements Iterator<ProjectStructureItem>, KMappedMarker { private final ArrayDeque<Pair<ProjectStructureItem, Iterator<ProjectStructureItem>>> stack; ProjectFileStructureKt$walk$1$iterator$1(ProjectStructureFolder $receiver) { this.stack = new ArrayDeque();
/* 481 */         this.isReady = true;
/*     */ 
/*     */         
/* 484 */         this.stack.addLast(TuplesKt.to($receiver, $receiver.getChildren().iterator())); }
/*     */        private boolean isReady;
/*     */       private final ProjectStructureItem fetchOrNull() {
/*     */         Iterator<ProjectStructureItem> content;
/* 488 */         if (this.isReady) {
/* 489 */           (Pair)this.stack.lastOrNull(); return ((Pair)this.stack.lastOrNull() != null) ? (ProjectStructureItem)((Pair)this.stack.lastOrNull()).getFirst() : null;
/*     */         } 
/*     */         while (true) {
/* 492 */           Pair entry = (Pair)this.stack.lastOrNull();
/* 493 */           if (entry == null) {
/* 494 */             this.isReady = true;
/* 495 */             return null;
/*     */           } 
/*     */           
/* 498 */           content = (Iterator)entry.getSecond();
/* 499 */           if (content == null || !content.hasNext()) {
/* 500 */             this.stack.removeLast(); continue;
/*     */           } 
/*     */           break;
/*     */         } 
/* 504 */         ProjectStructureItem nextItem = content.next();
/* 505 */         ((nextItem instanceof ProjectStructureFolder) ? nextItem : null).getChildren(); this.stack.addLast(TuplesKt.to(nextItem, (((nextItem instanceof ProjectStructureFolder) ? nextItem : null) != null && ((nextItem instanceof ProjectStructureFolder) ? nextItem : null).getChildren() != null) ? ((nextItem instanceof ProjectStructureFolder) ? nextItem : null).getChildren().iterator() : null));
/* 506 */         this.isReady = true;
/* 507 */         return nextItem;
/*     */       }
/*     */ 
/*     */       
/*     */       public boolean hasNext() {
/* 512 */         return (fetchOrNull() != null);
/*     */       }
/*     */       public ProjectStructureItem next() {
/*     */         ProjectStructureItem value;
/* 516 */         if (fetchOrNull() == null) { fetchOrNull(); throw new NoSuchElementException(); }
/* 517 */          this.isReady = false;
/* 518 */         return value;
/*     */       }
/*     */       
/*     */       public void remove() {
/*     */         throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */       } }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ProjectFileStructureKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */