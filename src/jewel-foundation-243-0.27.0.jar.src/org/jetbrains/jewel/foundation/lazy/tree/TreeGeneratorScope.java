/*     */ package org.jetbrains.jewel.foundation.lazy.tree;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\000\bf\030\000*\004\b\000\020\0012\0020\002JB\020\003\032\0020\0042\006\020\005\032\0028\0002\n\b\002\020\006\032\004\030\0010\0022\037\b\002\020\007\032\031\022\n\022\b\022\004\022\0028\0000\t\022\004\022\0020\0040\b¢\006\002\b\nH&¢\006\002\020\013J!\020\f\032\0020\0042\006\020\005\032\0028\0002\n\b\002\020\006\032\004\030\0010\002H&¢\006\002\020\rJ\026\020\016\032\0020\0042\f\020\017\032\b\022\004\022\0028\0000\020H&¨\006\021"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/TreeGeneratorScope;", "T", "", "addNode", "", "data", "id", "childrenGenerator", "Lkotlin/Function1;", "Lorg/jetbrains/jewel/foundation/lazy/tree/ChildrenGeneratorScope;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "addLeaf", "(Ljava/lang/Object;Ljava/lang/Object;)V", "add", "element", "Lorg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element;", "foundation"})
/*     */ public interface TreeGeneratorScope<T>
/*     */ {
/*     */   void addNode(T paramT, @Nullable Object paramObject, @NotNull Function1<? super ChildrenGeneratorScope<T>, Unit> paramFunction1);
/*     */   
/*     */   void addLeaf(T paramT, @Nullable Object paramObject);
/*     */   
/*     */   void add(@NotNull TreeBuilder.Element<T> paramElement);
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   public static final class DefaultImpls
/*     */   {
/*     */     private static Unit addNode$lambda$0(ChildrenGeneratorScope <this>) {
/* 127 */       Intrinsics.checkNotNullParameter(<this>, "<this>"); return Unit.INSTANCE;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\tree\TreeGeneratorScope.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */