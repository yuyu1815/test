/*    */ package org.jetbrains.jewel.ui;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.ProvidedValue;
/*    */ import java.util.Arrays;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\002\b\006\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\002\030\0002\0020\001B\033\022\022\020\002\032\016\022\n\b\001\022\006\022\002\b\0030\0040\003¢\006\004\b\005\020\006J\031\020\b\032\016\022\n\b\001\022\006\022\002\b\0030\0040\003H\027¢\006\002\020\tJ\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rH\002J\b\020\016\032\0020\017H\026J\b\020\020\032\0020\021H\026R\034\020\002\032\016\022\n\b\001\022\006\022\002\b\0030\0040\003X\004¢\006\004\n\002\020\007¨\006\022"}, d2 = {"Lorg/jetbrains/jewel/ui/StaticComponentStyling;", "Lorg/jetbrains/jewel/ui/ComponentStyling;", "values", "", "Landroidx/compose/runtime/ProvidedValue;", "<init>", "([Landroidx/compose/runtime/ProvidedValue;)V", "[Landroidx/compose/runtime/ProvidedValue;", "styles", "(Landroidx/compose/runtime/Composer;I)[Landroidx/compose/runtime/ProvidedValue;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui"})
/*    */ final class StaticComponentStyling
/*    */   implements ComponentStyling
/*    */ {
/*    */   @NotNull
/*    */   private final ProvidedValue<?>[] values;
/*    */   
/*    */   public StaticComponentStyling(@NotNull ProvidedValue[] values) {
/* 34 */     this.values = (ProvidedValue<?>[])values; } @NotNull public ComponentStyling provide(@NotNull ProvidedValue... values) { return ComponentStyling.DefaultImpls.provide(this, (ProvidedValue<?>[])values); } @NotNull public ComponentStyling provide(@NotNull Function2<? super Composer, ? super Integer, ? extends ProvidedValue<?>[]> provider) { return ComponentStyling.DefaultImpls.provide(this, provider); } @NotNull public ComponentStyling with(@NotNull ComponentStyling styling) { return ComponentStyling.DefaultImpls.with(this, styling); } @NotNull public ComponentStyling with(@NotNull Function2<? super Composer, ? super Integer, ? extends ComponentStyling> styling) { return ComponentStyling.DefaultImpls.with(this, styling); } @Composable @NotNull
/* 35 */   public ProvidedValue<?>[] styles(@Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(939649262); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(939649262, $changed, -1, "org.jetbrains.jewel.ui.StaticComponentStyling.styles (ComponentStyling.kt:34)");  ProvidedValue<?>[] arrayOfProvidedValue = this.values; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return arrayOfProvidedValue; }
/*    */    public boolean equals(@Nullable Object other) {
/* 37 */     return (other instanceof StaticComponentStyling && Arrays.equals((Object[])this.values, (Object[])((StaticComponentStyling)other).values));
/*    */   }
/* 39 */   public int hashCode() { return Arrays.hashCode((Object[])this.values); } @NotNull
/*    */   public String toString() {
/* 41 */     Intrinsics.checkNotNullExpressionValue(Arrays.toString((Object[])this.values), "toString(...)"); return "StaticComponentStyle(values=" + Arrays.toString((Object[])this.values) + ")";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\StaticComponentStyling.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */