/*    */ package ai.grazie.utils.json.schema;
/*    */ 
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\032\n\000\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\000\032\037\020\000\032\0020\0012\027\020\002\032\023\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\002\b\006¨\006\007"}, d2 = {"jsonSchema", "", "block", "Lkotlin/Function1;", "Lai/grazie/utils/json/schema/JSONSchemaType$JSONObjectType;", "", "Lkotlin/ExtensionFunctionType;", "utils-common"})
/*    */ public final class JSONSchemaKt
/*    */ {
/*    */   @NotNull
/*    */   public static final String jsonSchema(@NotNull Function1<? super JSONSchemaType.JSONObjectType, Unit> block) {
/* 26 */     Intrinsics.checkNotNullParameter(block, "block"); return (new JSONSchemaBuilder()).invoke(block).schema();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\json\schema\JSONSchemaKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */