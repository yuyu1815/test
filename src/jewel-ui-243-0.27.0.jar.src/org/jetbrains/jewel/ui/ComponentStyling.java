/*    */ package org.jetbrains.jewel.ui;@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\021\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\007\bf\030\000 \0172\0020\001:\001\017J)\020\002\032\0020\0002\032\020\003\032\016\022\n\b\001\022\006\022\002\b\0030\0050\004\"\006\022\002\b\0030\005H\026¢\006\002\020\006J,\020\002\032\0020\0002\035\020\007\032\031\022\020\022\016\022\n\b\001\022\006\022\002\b\0030\0050\0040\b¢\006\002\b\tH\026¢\006\002\020\nJ\020\020\013\032\0020\0002\006\020\f\032\0020\000H\026J \020\013\032\0020\0002\021\020\f\032\r\022\004\022\0020\0000\b¢\006\002\b\tH\026¢\006\002\020\nJ\031\020\r\032\016\022\n\b\001\022\006\022\002\b\0030\0050\004H'¢\006\002\020\016¨\006\020"}, d2 = {"Lorg/jetbrains/jewel/ui/ComponentStyling;", "", "provide", "values", "", "Landroidx/compose/runtime/ProvidedValue;", "([Landroidx/compose/runtime/ProvidedValue;)Lorg/jetbrains/jewel/ui/ComponentStyling;", "provider", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;)Lorg/jetbrains/jewel/ui/ComponentStyling;", "with", "styling", "styles", "(Landroidx/compose/runtime/Composer;I)[Landroidx/compose/runtime/ProvidedValue;", "Companion", "ui"}) public interface ComponentStyling { @NotNull public static final Companion Companion = Companion.$$INSTANCE; @NotNull ComponentStyling provide(@NotNull ProvidedValue<?>... paramVarArgs); @NotNull
/*    */   ComponentStyling provide(@NotNull Function2<? super Composer, ? super Integer, ? extends ProvidedValue<?>[]> paramFunction2); @NotNull
/*    */   ComponentStyling with(@NotNull ComponentStyling paramComponentStyling); @NotNull
/*    */   ComponentStyling with(@NotNull Function2<? super Composer, ? super Integer, ? extends ComponentStyling> paramFunction2); @Composable
/*    */   @NotNull
/*    */   ProvidedValue<?>[] styles(@Nullable Composer paramComposer, int paramInt); @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls { @NotNull
/*  8 */     public static ComponentStyling provide(@NotNull ComponentStyling $this, @NotNull ProvidedValue... values) { Intrinsics.checkNotNullParameter(values, "values"); if ((values.length == 0)) return $this; 
/*  9 */       return $this.with(new StaticComponentStyling((ProvidedValue<?>[])values)); }
/*    */     
/*    */     @NotNull
/*    */     public static ComponentStyling provide(@NotNull ComponentStyling $this, @NotNull Function2<? super Composer, ? super Integer, ? extends ProvidedValue<?>[]> provider) {
/* 13 */       Intrinsics.checkNotNullParameter(provider, "provider"); return $this.with(new LazyComponentStyling(provider));
/*    */     } @NotNull
/*    */     public static ComponentStyling with(@NotNull ComponentStyling $this, @NotNull ComponentStyling styling) {
/* 16 */       Intrinsics.checkNotNullParameter(styling, "styling"); if (styling instanceof ComponentStyling.Companion) return $this; 
/* 17 */       return new CombinedComponentStyling($this, styling);
/*    */     }
/*    */     @NotNull
/*    */     public static ComponentStyling with(@NotNull ComponentStyling $this, @NotNull Function2<? super Composer, ? super Integer, ? extends ComponentStyling> styling) {
/* 21 */       Intrinsics.checkNotNullParameter(styling, "styling"); return $this.with(new LazyComponentStyling(new ComponentStyling$with$1(styling)));
/*    */     } }
/*    */    @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\005\n\002\020\021\n\002\030\002\n\002\b\002\n\002\020\016\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0012\006\020\005\032\0020\001H\026J\031\020\006\032\016\022\n\b\001\022\006\022\002\b\0030\b0\007H\027¢\006\002\020\tJ\b\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Lorg/jetbrains/jewel/ui/ComponentStyling$Companion;", "Lorg/jetbrains/jewel/ui/ComponentStyling;", "<init>", "()V", "with", "styling", "styles", "", "Landroidx/compose/runtime/ProvidedValue;", "(Landroidx/compose/runtime/Composer;I)[Landroidx/compose/runtime/ProvidedValue;", "toString", "", "ui"})
/*    */   public static final class Companion implements ComponentStyling { @NotNull
/* 25 */     public ComponentStyling provide(@NotNull ProvidedValue... values) { return ComponentStyling.DefaultImpls.provide(this, (ProvidedValue<?>[])values); } @NotNull public ComponentStyling provide(@NotNull Function2<? super Composer, ? super Integer, ? extends ProvidedValue<?>[]> provider) { return ComponentStyling.DefaultImpls.provide(this, provider); } @NotNull public ComponentStyling with(@NotNull Function2<? super Composer, ? super Integer, ? extends ComponentStyling> styling) { return ComponentStyling.DefaultImpls.with(this, styling); } @NotNull
/* 26 */     public ComponentStyling with(@NotNull ComponentStyling styling) { Intrinsics.checkNotNullParameter(styling, "styling"); return styling; } @Composable
/*    */     @NotNull
/* 28 */     public ProvidedValue<?>[] styles(@Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(-1850539880); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1850539880, $changed, -1, "org.jetbrains.jewel.ui.ComponentStyling.Companion.styles (ComponentStyling.kt:27)");  ProvidedValue[] arrayOfProvidedValue = new ProvidedValue[0]; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return (ProvidedValue<?>[])arrayOfProvidedValue; } @NotNull
/*    */     public String toString() {
/* 30 */       return "ComponentStyleProvider";
/*    */     } }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\ComponentStyling.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */