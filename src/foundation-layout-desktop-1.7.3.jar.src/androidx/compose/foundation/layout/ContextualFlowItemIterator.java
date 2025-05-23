/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.layout.Measurable;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.markers.KMappedMarker;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020(\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020 \n\002\b\002\n\002\020!\n\002\b\b\n\002\020\013\n\002\b\002\b\000\030\0002\b\022\004\022\0020\0020\001BK\022\006\020\003\032\0020\004\022<\020\005\0328\022\023\022\0210\004¢\006\f\b\007\022\b\b\b\022\004\b\b(\t\022\023\022\0210\n¢\006\f\b\007\022\b\b\b\022\004\b\b(\013\022\n\022\b\022\004\022\0020\0020\f0\006¢\006\002\020\rJ\027\020\025\032\0020\0022\b\b\002\020\013\032\0020\nH\000¢\006\002\b\026J\t\020\027\032\0020\030H\002J\t\020\031\032\0020\002H\002R\024\020\016\032\b\022\004\022\0020\0020\017X\004¢\006\002\n\000RD\020\005\0328\022\023\022\0210\004¢\006\f\b\007\022\b\b\b\022\004\b\b(\t\022\023\022\0210\n¢\006\f\b\007\022\b\b\b\022\004\b\b(\013\022\n\022\b\022\004\022\0020\0020\f0\006X\004¢\006\002\n\000R\016\020\003\032\0020\004X\004¢\006\002\n\000R\016\020\020\032\0020\004X\016¢\006\002\n\000R\027\020\021\032\b\022\004\022\0020\0020\f8F¢\006\006\032\004\b\022\020\023R\016\020\024\032\0020\004X\016¢\006\002\n\000¨\006\032"}, d2 = {"Landroidx/compose/foundation/layout/ContextualFlowItemIterator;", "", "Landroidx/compose/ui/layout/Measurable;", "itemCount", "", "getMeasurables", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "index", "Landroidx/compose/foundation/layout/FlowLineInfo;", "info", "", "(ILkotlin/jvm/functions/Function2;)V", "_list", "", "itemIndex", "list", "getList", "()Ljava/util/List;", "listIndex", "getNext", "getNext$foundation_layout", "hasNext", "", "next", "foundation-layout"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class ContextualFlowItemIterator
/*     */   implements Iterator<Measurable>, KMappedMarker
/*     */ {
/*     */   private final int itemCount;
/*     */   @NotNull
/*     */   private final Function2<Integer, FlowLineInfo, List<Measurable>> getMeasurables;
/*     */   @NotNull
/*     */   private final List<Measurable> _list;
/*     */   private int itemIndex;
/*     */   private int listIndex;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public ContextualFlowItemIterator(int itemCount, @NotNull Function2<Integer, FlowLineInfo, List<Measurable>> getMeasurables) {
/* 488 */     this.itemCount = itemCount;
/* 489 */     this.getMeasurables = getMeasurables;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 494 */     this._list = new ArrayList<>();
/*     */   } @NotNull
/*     */   public final List<Measurable> getList() {
/* 497 */     return this._list;
/*     */   }
/*     */   public boolean hasNext() {
/* 500 */     return (this.listIndex < getList().size() || this.itemIndex < this.itemCount);
/*     */   }
/*     */   @NotNull
/*     */   public Measurable next() {
/* 504 */     return getNext$foundation_layout$default(this, null, 1, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final Measurable getNext$foundation_layout(@NotNull FlowLineInfo info) {
/* 513 */     Intrinsics.checkNotNullParameter(info, "info");
/* 514 */     Measurable measurable = getList().get(this.listIndex);
/* 515 */     int i = this.listIndex; this.listIndex = i + 1;
/*     */     
/* 517 */     if (this.itemIndex < this.itemCount) {
/* 518 */       List<? extends Measurable> measurables = (List)this.getMeasurables.invoke(Integer.valueOf(this.itemIndex), info);
/* 519 */       i = this.itemIndex; this.itemIndex = i + 1;
/*     */ 
/*     */ 
/*     */       
/* 523 */       Measurable measurable1 = (Measurable)CollectionsKt.first(measurables);
/* 524 */       this._list.addAll(measurables);
/* 525 */       int j = this.listIndex; this.listIndex = j + 1;
/*     */     }
/*     */     else {
/*     */       
/* 529 */       throw new IndexOutOfBoundsException(
/* 530 */           "No item returned at index call. Index: " + this.itemIndex);
/*     */     } 
/*     */     return (this.listIndex < getList().size()) ? measurable : (Measurable)"JD-Core does not support Kotlin";
/*     */   }
/*     */   
/*     */   public void remove() {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\ContextualFlowItemIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */