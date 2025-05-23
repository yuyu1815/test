/*    */ package ai.grazie.utils.mpp.collections;
/*    */ 
/*    */ import java.util.Arrays;
/*    */ import java.util.Set;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.ArraysKt;
/*    */ import kotlin.collections.SetsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.reflect.KClass;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000(\n\000\n\002\030\002\n\002\b\002\n\002\020\021\n\000\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\003\n\002\020\"\n\002\b\004\032/\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\f\020\003\032\b\022\004\022\002H\0020\0042\006\020\005\032\0020\006H\007¢\006\002\020\007\0324\020\b\032\b\022\004\022\002H\0020\001\"\n\b\000\020\002\030\001*\0020\t2\022\020\n\032\n\022\006\b\001\022\002H\0020\004\"\002H\002H\b¢\006\002\020\013\032\034\020\f\032\b\022\004\022\002H\0020\r\"\004\b\000\020\002*\b\022\004\022\002H\0020\001\032#\020\016\032\b\022\004\022\002H\0020\004\"\004\b\000\020\002*\b\022\004\022\002H\0020\001H\007¢\006\002\020\017\032%\020\020\032\b\022\004\022\002H\0020\001\"\n\b\000\020\002\030\001*\0020\t*\b\022\004\022\002H\0020\rH\b\032$\020\020\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\r2\006\020\005\032\0020\006¨\006\021"}, d2 = {"exportableSet", "Lai/grazie/utils/mpp/collections/ExportableSet;", "T", "values", "", "type", "Lai/grazie/utils/mpp/collections/ExportableType;", "([Ljava/lang/Object;Lai/grazie/utils/mpp/collections/ExportableType;)Lai/grazie/utils/mpp/collections/ExportableSet;", "exportableSetOf", "", "elements", "([Ljava/lang/Object;)Lai/grazie/utils/mpp/collections/ExportableSet;", "fromExportable", "", "toArray", "(Lai/grazie/utils/mpp/collections/ExportableSet;)[Ljava/lang/Object;", "toExportable", "utils-common"})
/*    */ @SourceDebugExtension({"SMAP\nExportableSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExportableSet.kt\nai/grazie/utils/mpp/collections/ExportableSetKt\n+ 2 ExportableType.kt\nai/grazie/utils/mpp/collections/ExportableTypeKt\n*L\n1#1,80:1\n78#1:81\n33#2:82\n33#2:83\n*S KotlinDebug\n*F\n+ 1 ExportableSet.kt\nai/grazie/utils/mpp/collections/ExportableSetKt\n*L\n66#1:81\n66#1:82\n78#1:83\n*E\n"})
/*    */ public final class ExportableSetKt
/*    */ {
/*    */   @NotNull
/*    */   public static final <T> T[] toArray(@NotNull ExportableSet $this$toArray) {
/* 56 */     Intrinsics.checkNotNullParameter($this$toArray, "<this>"); return (T[])ArraysKt.plus($this$toArray.getType$utils_common().getEmptyArray$utils_common(), $this$toArray.getSet$utils_common());
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final <T> ExportableSet<T> exportableSet(@NotNull Object[] values, @NotNull ExportableType type) {
/* 62 */     Intrinsics.checkNotNullParameter(values, "values"); Intrinsics.checkNotNullParameter(type, "type"); return new ExportableSet<>(ArraysKt.toSet(values), type);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final <T> Set<T> fromExportable(@NotNull ExportableSet<T> $this$fromExportable) {
/* 70 */     Intrinsics.checkNotNullParameter($this$fromExportable, "<this>"); return $this$fromExportable.getSet$utils_common();
/*    */   }
/*    */   @NotNull
/*    */   public static final <T> ExportableSet<T> toExportable(@NotNull Set<? extends T> $this$toExportable, @NotNull ExportableType type) {
/* 74 */     Intrinsics.checkNotNullParameter($this$toExportable, "<this>"); Intrinsics.checkNotNullParameter(type, "type"); return new ExportableSet<>($this$toExportable, type);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\collections\ExportableSetKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */