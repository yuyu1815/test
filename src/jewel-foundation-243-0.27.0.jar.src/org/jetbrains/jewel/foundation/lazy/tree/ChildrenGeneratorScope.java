/*     */ package org.jetbrains.jewel.foundation.lazy.tree;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import kotlin.Lazy;
/*     */ import kotlin.LazyKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.foundation.GenerateDataFunctions;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\020!\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\005\b\007\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002:\001\037B\025\022\f\020\003\032\b\022\004\022\0028\0000\004¢\006\004\b\005\020\006J\037\020\022\032\0020\0232\006\020\024\032\0028\0002\b\020\025\032\004\030\0010\026H\026¢\006\002\020\027J>\020\030\032\0020\0232\006\020\024\032\0028\0002\b\020\025\032\004\030\0010\0262\035\020\031\032\031\022\n\022\b\022\004\022\0028\0000\000\022\004\022\0020\0230\032¢\006\002\b\033H\026¢\006\002\020\034J\026\020\035\032\0020\0232\f\020\036\032\b\022\004\022\0028\0000\017H\026R\024\020\003\032\b\022\004\022\0028\0000\004X\004¢\006\002\n\000R!\020\007\032\b\022\004\022\0028\0000\b8FX\002¢\006\f\n\004\b\013\020\f\032\004\b\t\020\nR \020\r\032\016\022\n\022\b\022\004\022\0028\0000\0170\016X\004¢\006\b\n\000\032\004\b\020\020\021¨\006 "}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/ChildrenGeneratorScope;", "T", "Lorg/jetbrains/jewel/foundation/lazy/tree/TreeGeneratorScope;", "parentElement", "Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node;", "<init>", "(Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node;)V", "parent", "Lorg/jetbrains/jewel/foundation/lazy/tree/ChildrenGeneratorScope$ParentInfo;", "getParent", "()Lorg/jetbrains/jewel/foundation/lazy/tree/ChildrenGeneratorScope$ParentInfo;", "parent$delegate", "Lkotlin/Lazy;", "elements", "", "Lorg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element;", "getElements$foundation", "()Ljava/util/List;", "addLeaf", "", "data", "id", "", "(Ljava/lang/Object;Ljava/lang/Object;)V", "addNode", "childrenGenerator", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "add", "element", "ParentInfo", "foundation"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class ChildrenGeneratorScope<T>
/*     */   implements TreeGeneratorScope<T>
/*     */ {
/*     */   @NotNull
/*     */   private final Tree.Element.Node<T> parentElement;
/*     */   @NotNull
/*     */   private final Lazy parent$delegate;
/*     */   @NotNull
/*     */   private final List<TreeBuilder.Element<T>> elements;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public ChildrenGeneratorScope(@NotNull Tree.Element.Node<T> parentElement) {
/* 134 */     this.parentElement = parentElement;
/*     */ 
/*     */     
/* 137 */     this.parent$delegate = LazyKt.lazy(this::parent_delegate$lambda$0);
/*     */ 
/*     */ 
/*     */     
/* 141 */     this.elements = new ArrayList<>(); } @GenerateDataFunctions @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\n\b\007\030\000*\004\b\001\020\0012\0020\002B\037\022\006\020\003\032\0028\001\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005¢\006\004\b\007\020\bR\023\020\003\032\0028\001¢\006\n\n\002\020\013\032\004\b\t\020\nR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\f\020\rR\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\016\020\r¨\006\017"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/ChildrenGeneratorScope$ParentInfo;", "T", "", "data", "depth", "", "index", "<init>", "(Ljava/lang/Object;II)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getDepth", "()I", "getIndex", "foundation"}) @StabilityInferred(parameters = 1) public static final class ParentInfo<T> { private final T data; private final int depth; private final int index; public static final int $stable; public ParentInfo(Object data, int depth, int index) { this.data = (T)data; this.depth = depth; this.index = index; } public final T getData() { return this.data; } public final int getDepth() { return this.depth; } public final int getIndex() { return this.index; } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof ParentInfo)) return false;  ParentInfo parentInfo = (ParentInfo)other; return !Intrinsics.areEqual(this.data, parentInfo.data) ? false : ((this.depth != parentInfo.depth) ? false : (!(this.index != parentInfo.index))); } public int hashCode() { result = (this.data == null) ? 0 : this.data.hashCode(); result = result * 31 + this.depth; return result * 31 + this.index; } @NotNull public String toString() { return "ParentInfo(data=" + this.data + ", depth=" + this.depth + ", index=" + this.index + ")"; } } @NotNull public final List<TreeBuilder.Element<T>> getElements$foundation() { return this.elements; }
/*     */   @NotNull public final ParentInfo<T> getParent() { Lazy lazy = this.parent$delegate;
/*     */     return (ParentInfo<T>)lazy.getValue(); }
/* 144 */   private static final ParentInfo parent_delegate$lambda$0(ChildrenGeneratorScope this$0) { return new ParentInfo(this$0.parentElement.getData(), this$0.parentElement.getDepth(), this$0.parentElement.getChildIndex()); } public void addLeaf(Object data, @Nullable Object id) { this.elements.add(new TreeBuilder.Element.Leaf<>((T)data, id)); }
/*     */ 
/*     */   
/*     */   public void addNode(Object data, @Nullable Object id, @NotNull Function1<? super ChildrenGeneratorScope<T>, Unit> childrenGenerator) {
/* 148 */     Intrinsics.checkNotNullParameter(childrenGenerator, "childrenGenerator"); this.elements.add(new TreeBuilder.Element.Node<>((T)data, id, childrenGenerator));
/*     */   }
/*     */   
/*     */   public void add(@NotNull TreeBuilder.Element<T> element) {
/* 152 */     Intrinsics.checkNotNullParameter(element, "element"); this.elements.add(element);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\tree\ChildrenGeneratorScope.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */