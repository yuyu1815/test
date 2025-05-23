/*    */ package ai.grazie.utils.attributes;
/*    */ 
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.NoWhenBranchMatchedException;
/*    */ import kotlin.collections.MapsKt;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\002\n\002\020$\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\b\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\037\020\007\032\0020\0042\027\020\b\032\023\022\004\022\0020\n\022\004\022\0020\0130\t¢\006\002\b\fJ\037\020\r\032\0020\0042\024\b\002\020\016\032\016\022\004\022\0020\020\022\004\022\0020\0210\017H\002J\017\020\022\032\b\022\004\022\0020\0040\023HÆ\001J!\020\024\032\002H\025\"\004\b\000\020\0252\006\020\026\032\0020\0202\006\020\027\032\0020\021¢\006\002\020\030J!\020\031\032\0020\021\"\004\b\000\020\0252\006\020\027\032\002H\0252\006\020\026\032\0020\020¢\006\002\020\032R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\033"}, d2 = {"Lai/grazie/utils/attributes/Attributes$Companion;", "", "()V", "empty", "Lai/grazie/utils/attributes/Attributes;", "getEmpty", "()Lai/grazie/utils/attributes/Attributes;", "build", "builder", "Lkotlin/Function1;", "Lai/grazie/utils/attributes/AttributesBuilder;", "", "Lkotlin/ExtensionFunctionType;", "invoke", "data", "", "Lai/grazie/utils/attributes/Attributes$Key;", "Lai/grazie/utils/attributes/Attributes$Value;", "serializer", "Lkotlinx/serialization/KSerializer;", "unwrap", "T", "key", "value", "(Lai/grazie/utils/attributes/Attributes$Key;Lai/grazie/utils/attributes/Attributes$Value;)Ljava/lang/Object;", "wrap", "(Ljava/lang/Object;Lai/grazie/utils/attributes/Attributes$Key;)Lai/grazie/utils/attributes/Attributes$Value;", "utils-common"})
/*    */ public final class Companion {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<Attributes> serializer() {
/* 19 */     return (KSerializer<Attributes>)Attributes.$serializer.INSTANCE;
/*    */   } @NotNull
/* 21 */   public final Attributes invoke(@NotNull Map data) { Intrinsics.checkNotNullParameter(data, "data"); return new Attributes(MapsKt.toMutableMap(data)); } @NotNull
/*    */   public final Attributes getEmpty() {
/* 23 */     return Attributes.access$getEmpty$cp();
/*    */   } @NotNull
/*    */   public final Attributes build(@NotNull Function1 builder) {
/* 26 */     Intrinsics.checkNotNullParameter(builder, "builder"); AttributesBuilder attributesBuilder = new AttributesBuilder(null, 1, null); builder.invoke(attributesBuilder); return attributesBuilder.build$utils_common();
/*    */   }
/*    */ 
/*    */   
/*    */   public final <T> T unwrap(@NotNull Attributes.Key key, @NotNull Attributes.Value value) {
/* 31 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(value, "value"); Attributes.Key key1 = key;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 37 */     if (key1 instanceof Attributes.Key.Text) {  } else { throw new NoWhenBranchMatchedException(); }
/*    */     
/*    */     return (key1 instanceof Attributes.Key.Bool) ? (T)((Attributes.Value.Bool)value).getValue() : ((key1 instanceof Attributes.Key.Bytes) ? (T)((Attributes.Value.Bytes)value).getValue() : ((key1 instanceof Attributes.Key.Double) ? (T)((Attributes.Value.Double)value).getValue() : ((key1 instanceof Attributes.Key.Json) ? (T)((Attributes.Value.Json)value).getValue() : ((key1 instanceof Attributes.Key.Long) ? (T)((Attributes.Value.Long)value).getValue() : (T)"JD-Core does not support Kotlin"))));
/*    */   } @NotNull
/*    */   public final <T> Attributes.Value wrap(Object value, @NotNull Attributes.Key key) {
/* 42 */     Intrinsics.checkNotNullParameter(key, "key"); Attributes.Key key1 = key;
/* 43 */     Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Boolean");
/* 44 */     Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.ByteArray");
/* 45 */     Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
/* 46 */     Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.String");
/* 47 */     Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Long");
/* 48 */     if (key1 instanceof Attributes.Key.Text) { Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.String"); } else { throw new NoWhenBranchMatchedException(); }
/*    */     
/*    */     return (key1 instanceof Attributes.Key.Bool) ? new Attributes.Value.Bool(((Boolean)value).booleanValue(), null, 2, null) : ((key1 instanceof Attributes.Key.Bytes) ? new Attributes.Value.Bytes((byte[])value, null, 2, null) : ((key1 instanceof Attributes.Key.Double) ? new Attributes.Value.Double(((Double)value).doubleValue(), null, 2, null) : ((key1 instanceof Attributes.Key.Json) ? new Attributes.Value.Json((String)value, null, 2, null) : ((key1 instanceof Attributes.Key.Long) ? new Attributes.Value.Long(((Long)value).longValue(), null, 2, null) : (Attributes.Value)"JD-Core does not support Kotlin"))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\attributes\Attributes$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */