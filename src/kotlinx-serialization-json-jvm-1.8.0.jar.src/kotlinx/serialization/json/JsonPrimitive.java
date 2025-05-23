/*    */ package kotlinx.serialization.json;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
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
/*    */ @Serializable(with = JsonPrimitiveSerializer.class)
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\002\n\002\020\016\n\002\b\004\n\002\030\002\n\002\030\002\n\000\b7\030\000 \f2\0020\001:\001\fB\t\b\004¢\006\004\b\002\020\003J\b\020\013\032\0020\bH\026R\022\020\004\032\0020\005X¦\004¢\006\006\032\004\b\004\020\006R\022\020\007\032\0020\bX¦\004¢\006\006\032\004\b\t\020\n\001\002\r\016¨\006\017"}, d2 = {"Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlinx/serialization/json/JsonElement;", "<init>", "()V", "isString", "", "()Z", "content", "", "getContent", "()Ljava/lang/String;", "toString", "Companion", "Lkotlinx/serialization/json/JsonLiteral;", "Lkotlinx/serialization/json/JsonNull;", "kotlinx-serialization-json"})
/*    */ public abstract class JsonPrimitive
/*    */   extends JsonElement
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lkotlinx/serialization/json/JsonPrimitive$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonPrimitive;", "kotlinx-serialization-json"})
/*    */   public static final class Companion
/*    */   {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<JsonPrimitive> serializer() {
/* 32 */       return JsonPrimitiveSerializer.INSTANCE; } } private JsonPrimitive() {
/* 33 */     super(null);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public abstract boolean isString();
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public abstract String getContent();
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/* 49 */     return getContent();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\JsonPrimitive.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */