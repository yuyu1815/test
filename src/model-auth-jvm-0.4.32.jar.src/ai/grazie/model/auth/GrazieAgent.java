/*    */ package ai.grazie.model.auth;
/*    */ 
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import java.util.Locale;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable(with = GrazieAgent.Serializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\004\b\007\030\000 \0202\0020\001:\002\020\021B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\005J\023\020\006\032\0020\0072\b\020\b\032\004\030\0010\tH\002J\b\020\n\032\0020\013H\026J\016\020\f\032\0020\0072\006\020\r\032\0020\016J\006\020\017\032\0020\003¨\006\022"}, d2 = {"Lai/grazie/model/auth/GrazieAgent;", "Lai/grazie/model/auth/GrazieAgentBase;", "name", "", "version", "(Ljava/lang/String;Ljava/lang/String;)V", "equals", "", "other", "", "hashCode", "", "isProduct", "product", "Lai/grazie/model/auth/GrazieProduct;", "json", "Companion", "Serializer", "model-auth"})
/*    */ @SourceDebugExtension({"SMAP\nGrazieAgent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieAgent.kt\nai/grazie/model/auth/GrazieAgent\n+ 2 JSON.kt\nai/grazie/utils/json/JSON\n*L\n1#1,55:1\n28#2:56\n*S KotlinDebug\n*F\n+ 1 GrazieAgent.kt\nai/grazie/model/auth/GrazieAgent\n*L\n25#1:56\n*E\n"})
/*    */ public final class GrazieAgent extends GrazieAgentBase {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/auth/GrazieAgent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/auth/GrazieAgent;", "model-auth"})
/*    */   public static final class Companion { @NotNull
/*    */     public final KSerializer<GrazieAgent> serializer() {
/* 20 */       return GrazieAgent.Serializer.INSTANCE;
/*    */     } private Companion() {} } public GrazieAgent(@NotNull String name, @NotNull String version) {
/* 22 */     super(name, version); }
/* 23 */   public final boolean isProduct(@NotNull GrazieProduct product) { Intrinsics.checkNotNullParameter(product, "product"); Intrinsics.checkNotNullExpressionValue(getName().toLowerCase(Locale.ROOT), "toLowerCase(...)"); return ArraysKt.contains((Object[])product.getAgents(), getName().toLowerCase(Locale.ROOT)); } @NotNull
/*    */   public final String json() {
/* 25 */     JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$string = 0; return 
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
/* 56 */       this_$iv.string((SerializationStrategy)Companion.serializer(), this);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return 31 * getName().hashCode() + getVersion().hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof GrazieAgent))
/*    */       return false; 
/*    */     return (Intrinsics.areEqual(getName(), ((GrazieAgent)other).getName()) && Intrinsics.areEqual(getVersion(), ((GrazieAgent)other).getVersion()));
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\020\020\n\032\0020\0022\006\020\013\032\0020\fH\026J\030\020\r\032\0020\0162\006\020\017\032\0020\0202\006\020\021\032\0020\002H\026R\024\020\004\032\b\022\004\022\0020\0050\001X\004¢\006\002\n\000R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\b\020\t¨\006\022"}, d2 = {"Lai/grazie/model/auth/GrazieAgent$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/auth/GrazieAgent;", "()V", "baseSerializer", "Lai/grazie/model/auth/GrazieAgentBase;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-auth"})
/*    */   public static final class Serializer implements KSerializer<GrazieAgent> {
/*    */     @NotNull
/*    */     public static final Serializer INSTANCE = new Serializer();
/*    */     @NotNull
/*    */     private static final KSerializer<GrazieAgentBase> baseSerializer = GrazieAgentBase.Companion.serializer();
/*    */     @NotNull
/*    */     private static final SerialDescriptor descriptor = baseSerializer.getDescriptor();
/*    */     
/*    */     @NotNull
/*    */     public SerialDescriptor getDescriptor() {
/*    */       return descriptor;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public GrazieAgent deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       GrazieAgentBase agentBase = (GrazieAgentBase)baseSerializer.deserialize(decoder);
/*    */       return new GrazieAgent(agentBase.getName(), agentBase.getVersion());
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull GrazieAgent value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       Intrinsics.checkNotNullExpressionValue(value.getName().toLowerCase(Locale.ROOT), "toLowerCase(...)");
/*    */       baseSerializer.serialize(encoder, new GrazieAgentBase(value.getName().toLowerCase(Locale.ROOT), value.getVersion()));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-auth-jvm-0.4.32.jar!\ai\grazie\model\auth\GrazieAgent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */