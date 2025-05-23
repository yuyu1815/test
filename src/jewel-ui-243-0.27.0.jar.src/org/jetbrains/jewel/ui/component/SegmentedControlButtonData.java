/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function4;
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
/*     */ @GenerateDataFunctions
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\n\b\007\030\0002\0020\001BP\022\006\020\002\032\0020\003\0221\020\004\032-\022\004\022\0020\006\022\023\022\0210\007¢\006\f\b\b\022\b\b\t\022\004\b\b(\n\022\004\022\0020\0130\005¢\006\002\b\f¢\006\002\b\r\022\f\020\016\032\b\022\004\022\0020\0130\017¢\006\004\b\020\020\021R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\022\020\023R>\020\004\032-\022\004\022\0020\006\022\023\022\0210\007¢\006\f\b\b\022\b\b\t\022\004\b\b(\n\022\004\022\0020\0130\005¢\006\002\b\f¢\006\002\b\r¢\006\n\n\002\020\026\032\004\b\024\020\025R\027\020\016\032\b\022\004\022\0020\0130\017¢\006\b\n\000\032\004\b\027\020\030¨\006\031"}, d2 = {"Lorg/jetbrains/jewel/ui/component/SegmentedControlButtonData;", "", "selected", "", "content", "Lkotlin/Function2;", "Lorg/jetbrains/jewel/ui/component/SegmentedControlButtonScope;", "Lorg/jetbrains/jewel/ui/component/SegmentedControlButtonState;", "Lkotlin/ParameterName;", "name", "segmentedControlButtonState", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/runtime/Composable;", "onSelect", "Lkotlin/Function0;", "<init>", "(ZLkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function0;)V", "getSelected", "()Z", "getContent", "()Lkotlin/jvm/functions/Function4;", "Lkotlin/jvm/functions/Function4;", "getOnSelect", "()Lkotlin/jvm/functions/Function0;", "ui"})
/*     */ @Immutable
/*     */ public final class SegmentedControlButtonData
/*     */ {
/*     */   private final boolean selected;
/*     */   @NotNull
/*     */   private final Function4<SegmentedControlButtonScope, SegmentedControlButtonState, Composer, Integer, Unit> content;
/*     */   @NotNull
/*     */   private final Function0<Unit> onSelect;
/*     */   public static final int $stable;
/*     */   
/*     */   public SegmentedControlButtonData(boolean selected, @NotNull Function4<SegmentedControlButtonScope, SegmentedControlButtonState, Composer, Integer, Unit> content, @NotNull Function0<Unit> onSelect) {
/* 114 */     this.selected = selected;
/* 115 */     this.content = content;
/*     */ 
/*     */     
/* 118 */     this.onSelect = onSelect; } @NotNull public final Function0<Unit> getOnSelect() { return this.onSelect; }
/*     */ 
/*     */   
/*     */   public final boolean getSelected() {
/*     */     return this.selected;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Function4<SegmentedControlButtonScope, SegmentedControlButtonState, Composer, Integer, Unit> getContent() {
/*     */     return this.content;
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof SegmentedControlButtonData))
/*     */       return false; 
/*     */     SegmentedControlButtonData segmentedControlButtonData = (SegmentedControlButtonData)other;
/*     */     return (this.selected != segmentedControlButtonData.selected) ? false : (!Intrinsics.areEqual(this.content, segmentedControlButtonData.content) ? false : (!!Intrinsics.areEqual(this.onSelect, segmentedControlButtonData.onSelect)));
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = Boolean.hashCode(this.selected);
/*     */     result = result * 31 + this.content.hashCode();
/*     */     return result * 31 + this.onSelect.hashCode();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "SegmentedControlButtonData(selected=" + this.selected + ", content=" + this.content + ", onSelect=" + this.onSelect + ")";
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\SegmentedControlButtonData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */