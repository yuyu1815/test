/*    */ package ai.grazie.utils.json;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlinx.serialization.json.JsonBuilder;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lkotlinx/serialization/json/JsonBuilder;", "invoke"})
/*    */ final class null extends Lambda implements Function1<JsonBuilder, Unit> {
/*    */   public final void invoke(JsonBuilder $this$Json) {
/* 12 */     Intrinsics.checkNotNullParameter($this$Json, "$this$Json"); $this$Json.setIgnoreUnknownKeys(true);
/* 13 */     $this$Json.setAllowStructuredMapKeys(true);
/*    */   }
/*    */   
/*    */   public static final null INSTANCE = (null)new Object();
/*    */   
/*    */   null() {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\json\JSON$Default$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */