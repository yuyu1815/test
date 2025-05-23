/*    */ package ai.grazie.utils.data;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\037\020\007\032\0020\0042\027\020\b\032\023\022\004\022\0020\n\022\004\022\0020\0130\t¢\006\002\b\fJ\017\020\r\032\b\022\004\022\0020\0040\016HÆ\001R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\017"}, d2 = {"Lai/grazie/utils/data/DataHolder$Companion;", "", "()V", "empty", "Lai/grazie/utils/data/DataHolder;", "getEmpty", "()Lai/grazie/utils/data/DataHolder;", "build", "builder", "Lkotlin/Function1;", "Lai/grazie/utils/data/DataHolderBuilder;", "", "Lkotlin/ExtensionFunctionType;", "serializer", "Lkotlinx/serialization/KSerializer;", "utils-common"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<DataHolder> serializer() {
/* 46 */     return DataHolderSerializer.INSTANCE; } @NotNull
/* 47 */   public final DataHolder getEmpty() { return DataHolder.access$getEmpty$cp(); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final DataHolder build(@NotNull Function1 builder) {
/* 56 */     Intrinsics.checkNotNullParameter(builder, "builder"); DataHolderBuilder dataHolderBuilder = new DataHolderBuilder(); builder.invoke(dataHolderBuilder); return dataHolderBuilder.build$utils_common();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\data\DataHolder$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */