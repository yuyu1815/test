/*    */ package org.jetbrains.jewel.foundation.actionSystem;
/*    */ 
/*    */ import androidx.compose.ui.Modifier;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\032\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\000\032#\020\000\032\0020\001*\0020\0012\027\020\002\032\023\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\002\b\006¨\006\007"}, d2 = {"provideData", "Landroidx/compose/ui/Modifier;", "dataProvider", "Lkotlin/Function1;", "Lorg/jetbrains/jewel/foundation/actionSystem/DataProviderContext;", "", "Lkotlin/ExtensionFunctionType;", "foundation"})
/*    */ public final class ProvideDataKt
/*    */ {
/*    */   @NotNull
/*    */   public static final Modifier provideData(@NotNull Modifier $this$provideData, @NotNull Function1<? super DataProviderContext, Unit> dataProvider) {
/* 20 */     Intrinsics.checkNotNullParameter($this$provideData, "<this>"); Intrinsics.checkNotNullParameter(dataProvider, "dataProvider"); return $this$provideData.then((Modifier)new DataProviderElement(dataProvider));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\actionSystem\ProvideDataKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */