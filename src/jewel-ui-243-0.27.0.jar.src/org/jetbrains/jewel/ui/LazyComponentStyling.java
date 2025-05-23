/*    */ package org.jetbrains.jewel.ui;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.ProvidedValue;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\020\021\n\002\030\002\n\002\030\002\n\002\b\b\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\002\030\0002\0020\001B&\022\035\020\002\032\031\022\020\022\016\022\n\b\001\022\006\022\002\b\0030\0050\0040\003¢\006\002\b\006¢\006\004\b\007\020\bJ\031\020\f\032\016\022\n\b\001\022\006\022\002\b\0030\0050\004H\027¢\006\002\020\rJ\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\021H\002J\b\020\022\032\0020\023H\026J\b\020\024\032\0020\025H\026R*\020\002\032\031\022\020\022\016\022\n\b\001\022\006\022\002\b\0030\0050\0040\003¢\006\002\b\006¢\006\n\n\002\020\013\032\004\b\t\020\n¨\006\026"}, d2 = {"Lorg/jetbrains/jewel/ui/LazyComponentStyling;", "Lorg/jetbrains/jewel/ui/ComponentStyling;", "provider", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/ProvidedValue;", "Landroidx/compose/runtime/Composable;", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "getProvider", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function2;", "styles", "(Landroidx/compose/runtime/Composer;I)[Landroidx/compose/runtime/ProvidedValue;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui"})
/*    */ final class LazyComponentStyling
/*    */   implements ComponentStyling
/*    */ {
/*    */   @NotNull
/*    */   private final Function2<Composer, Integer, ProvidedValue<?>[]> provider;
/*    */   
/*    */   public LazyComponentStyling(@NotNull Function2<Composer, Integer, ProvidedValue<?>[]> provider) {
/* 44 */     this.provider = provider; } @NotNull public final Function2<Composer, Integer, ProvidedValue<?>[]> getProvider() { return this.provider; } @NotNull public ComponentStyling provide(@NotNull ProvidedValue... values) { return ComponentStyling.DefaultImpls.provide(this, (ProvidedValue<?>[])values); } @NotNull public ComponentStyling provide(@NotNull Function2<? super Composer, ? super Integer, ? extends ProvidedValue<?>[]> provider) { return ComponentStyling.DefaultImpls.provide(this, provider); } @NotNull public ComponentStyling with(@NotNull ComponentStyling styling) { return ComponentStyling.DefaultImpls.with(this, styling); } @NotNull public ComponentStyling with(@NotNull Function2<? super Composer, ? super Integer, ? extends ComponentStyling> styling) { return ComponentStyling.DefaultImpls.with(this, styling); } @Composable @NotNull
/* 45 */   public ProvidedValue<?>[] styles(@Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(-192097804); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-192097804, $changed, -1, "org.jetbrains.jewel.ui.LazyComponentStyling.styles (ComponentStyling.kt:44)");  ProvidedValue[] arrayOfProvidedValue = (ProvidedValue[])this.provider.invoke($composer, Integer.valueOf(0)); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return (ProvidedValue<?>[])arrayOfProvidedValue; }
/*    */    public boolean equals(@Nullable Object other) {
/* 47 */     return (other instanceof LazyComponentStyling && Intrinsics.areEqual(this.provider, ((LazyComponentStyling)other).provider));
/*    */   }
/* 49 */   public int hashCode() { return this.provider.hashCode(); } @NotNull
/*    */   public String toString() {
/* 51 */     return "DynamicComponentStyleProvider(provider=" + this.provider + ")";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\LazyComponentStyling.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */