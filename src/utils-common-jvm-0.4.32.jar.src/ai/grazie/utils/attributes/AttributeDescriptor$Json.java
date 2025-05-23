/*    */ package ai.grazie.utils.attributes;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\013\n\002\b\b\n\002\030\002\n\002\b\003\b&\030\000*\004\b\003\020\0012\024\022\004\022\0020\003\022\004\022\0020\004\022\004\022\002H\0010\002B\025\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b¢\006\002\020\tJ\032\020\n\032\004\b\0028\0032\006\020\013\032\0020\006H$ø\001\000¢\006\002\020\fJ\006\020\r\032\0020\003J\032\020\016\032\0020\0062\b\020\013\032\004\b\0028\003H$ø\001\000¢\006\002\020\017J\023\020\020\032\0028\0032\006\020\013\032\0020\021¢\006\002\020\022J\025\020\013\032\004\030\0010\0042\006\020\013\032\0028\003¢\006\002\020\023\002\004\n\002\b9¨\006\024"}, d2 = {"Lai/grazie/utils/attributes/AttributeDescriptor$Json;", "T", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key$Json;", "Lai/grazie/utils/attributes/Attributes$Value$Json;", "name", "", "optional", "", "(Ljava/lang/String;Z)V", "fromJson", "value", "(Ljava/lang/String;)Ljava/lang/Object;", "key", "toJson", "(Ljava/lang/Object;)Ljava/lang/String;", "unwrap", "Lai/grazie/utils/attributes/Attributes$Value;", "(Lai/grazie/utils/attributes/Attributes$Value;)Ljava/lang/Object;", "(Ljava/lang/Object;)Lai/grazie/utils/attributes/Attributes$Value$Json;", "utils-common"})
/*    */ @SourceDebugExtension({"SMAP\nAttributeDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttributeDescriptor.kt\nai/grazie/utils/attributes/AttributeDescriptor$Json\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n1#2:85\n*E\n"})
/*    */ public abstract class Json<T>
/*    */   extends AttributeDescriptor<Attributes.Key.Json, Attributes.Value.Json, T>
/*    */ {
/*    */   public Json(@NotNull String name, boolean optional) {
/* 72 */     super(name, optional); } @NotNull
/* 73 */   public final Attributes.Key.Json key() { return new Attributes.Key.Json(getName(), null, 2, null); } @Nullable
/* 74 */   public final Attributes.Value.Json value(Object value) { Object it = value;
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
/* 85 */     int $i$a$-let-AttributeDescriptor$Json$value$1 = 0;
/*    */     return (value != null) ? new Attributes.Value.Json(toJson((T)value), null, 2, null) : null; }
/*    */ 
/*    */   
/*    */   public final T unwrap(@NotNull Attributes.Value value) {
/*    */     Intrinsics.checkNotNullParameter(value, "value");
/*    */     if (!(value instanceof Attributes.Value.Json))
/*    */       throw new IllegalStateException(("Expected json for " + key() + " attribute").toString()); 
/*    */     return fromJson(((Attributes.Value.Json)value).getValue());
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   protected abstract String toJson(@NotNull T paramT);
/*    */   
/*    */   @NotNull
/*    */   protected abstract T fromJson(@NotNull String paramString);
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\attributes\AttributeDescriptor$Json.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */