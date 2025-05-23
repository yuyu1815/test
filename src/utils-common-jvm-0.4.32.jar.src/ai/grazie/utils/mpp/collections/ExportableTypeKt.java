/*    */ package ai.grazie.utils.mpp.collections;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlin.reflect.KClasses;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\"\n\000\n\002\020\002\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\021\n\002\b\002\032\022\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004\032\037\020\005\032\0020\002\"\n\b\000\020\006\030\001*\0020\004*\b\022\004\022\002H\0060\007H\b\032-\020\005\032\0020\002\"\b\b\000\020\006*\0020\004*\b\022\004\022\002H\0060\0072\f\020\b\032\b\022\004\022\002H\0060\t¢\006\002\020\n¨\006\013"}, d2 = {"requireIsInstance", "", "Lai/grazie/utils/mpp/collections/ExportableType;", "value", "", "toExportable", "T", "Lkotlin/reflect/KClass;", "emptyArray", "", "(Lkotlin/reflect/KClass;[Ljava/lang/Object;)Lai/grazie/utils/mpp/collections/ExportableType;", "utils-common"})
/*    */ public final class ExportableTypeKt
/*    */ {
/*    */   @NotNull
/*    */   public static final <T> ExportableType toExportable(@NotNull KClass<?> $this$toExportable, @NotNull Object[] emptyArray) {
/* 31 */     Intrinsics.checkNotNullParameter($this$toExportable, "<this>"); Intrinsics.checkNotNullParameter(emptyArray, "emptyArray"); return new ExportableType($this$toExportable, emptyArray);
/*    */   }
/*    */ 
/*    */   
/*    */   public static final void requireIsInstance(@NotNull ExportableType $this$requireIsInstance, @NotNull Object value) {
/* 36 */     Intrinsics.checkNotNullParameter($this$requireIsInstance, "<this>"); Intrinsics.checkNotNullParameter(value, "value"); KClasses.cast($this$requireIsInstance.getKlass$utils_common(), value);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\collections\ExportableTypeKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */