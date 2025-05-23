/*    */ package org.jetbrains.jewel.ui;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.ProvidedValue;
/*    */ import java.util.Collection;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.ArraysKt;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\002\b\005\n\002\020\021\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\002\030\0002\0020\001B\027\022\006\020\002\032\0020\001\022\006\020\003\032\0020\001¢\006\004\b\004\020\005J\031\020\006\032\016\022\n\b\001\022\006\022\002\b\0030\b0\007H\027¢\006\002\020\tJ\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rH\002J\b\020\016\032\0020\017H\026J\b\020\020\032\0020\021H\026R\016\020\002\032\0020\001X\004¢\006\002\n\000R\016\020\003\032\0020\001X\004¢\006\002\n\000¨\006\022"}, d2 = {"Lorg/jetbrains/jewel/ui/CombinedComponentStyling;", "Lorg/jetbrains/jewel/ui/ComponentStyling;", "left", "right", "<init>", "(Lorg/jetbrains/jewel/ui/ComponentStyling;Lorg/jetbrains/jewel/ui/ComponentStyling;)V", "styles", "", "Landroidx/compose/runtime/ProvidedValue;", "(Landroidx/compose/runtime/Composer;I)[Landroidx/compose/runtime/ProvidedValue;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui"})
/*    */ @SourceDebugExtension({"SMAP\nComponentStyling.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentStyling.kt\norg/jetbrains/jewel/ui/CombinedComponentStyling\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,67:1\n37#2,2:68\n*S KotlinDebug\n*F\n+ 1 ComponentStyling.kt\norg/jetbrains/jewel/ui/CombinedComponentStyling\n*L\n58#1:68,2\n*E\n"})
/*    */ final class CombinedComponentStyling
/*    */   implements ComponentStyling
/*    */ {
/*    */   @NotNull
/*    */   private final ComponentStyling left;
/*    */   @NotNull
/*    */   private final ComponentStyling right;
/*    */   
/*    */   public CombinedComponentStyling(@NotNull ComponentStyling left, @NotNull ComponentStyling right) {
/* 54 */     this.left = left; this.right = right; } @NotNull public ComponentStyling provide(@NotNull ProvidedValue... values) { return ComponentStyling.DefaultImpls.provide(this, (ProvidedValue<?>[])values); } @NotNull public ComponentStyling provide(@NotNull Function2<? super Composer, ? super Integer, ? extends ProvidedValue<?>[]> provider) { return ComponentStyling.DefaultImpls.provide(this, provider); } @NotNull public ComponentStyling with(@NotNull ComponentStyling styling) { return ComponentStyling.DefaultImpls.with(this, styling); } @NotNull public ComponentStyling with(@NotNull Function2<? super Composer, ? super Integer, ? extends ComponentStyling> styling) { return ComponentStyling.DefaultImpls.with(this, styling); }
/*    */    @Composable
/*    */   @NotNull
/*    */   public ProvidedValue<?>[] styles(@Nullable Composer $composer, int $changed) {
/* 58 */     $composer.startReplaceGroup(134669061); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(134669061, $changed, -1, "org.jetbrains.jewel.ui.CombinedComponentStyling.styles (ComponentStyling.kt:57)");  Collection $this$toTypedArray$iv = CollectionsKt.plus(ArraysKt.toList((Object[])this.left.styles($composer, 0)), ArraysKt.toList((Object[])this.right.styles($composer, 0))); int $i$f$toTypedArray = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 68 */     Collection thisCollection$iv = $this$toTypedArray$iv;
/* 69 */     ProvidedValue[] arrayOfProvidedValue = (ProvidedValue[])thisCollection$iv.toArray((Object[])new ProvidedValue[0]);
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */     $composer.endReplaceGroup();
/*    */     return (ProvidedValue<?>[])arrayOfProvidedValue;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     return (other instanceof CombinedComponentStyling && Intrinsics.areEqual(this.left, ((CombinedComponentStyling)other).left) && Intrinsics.areEqual(this.right, ((CombinedComponentStyling)other).right));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.left.hashCode() + 31 * this.right.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "CombinedComponentStyleProvider(left=" + this.left + ", right=" + this.right + ")";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\CombinedComponentStyling.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */