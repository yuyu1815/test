/*    */ package ai.grazie.model.auth;
/*    */ 
/*    */ import java.util.Locale;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\020\020\n\032\0020\0022\006\020\013\032\0020\fH\026J\030\020\r\032\0020\0162\006\020\017\032\0020\0202\006\020\021\032\0020\002H\026R\024\020\004\032\b\022\004\022\0020\0050\001X\004¢\006\002\n\000R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\b\020\t¨\006\022"}, d2 = {"Lai/grazie/model/auth/GrazieAgent$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/auth/GrazieAgent;", "()V", "baseSerializer", "Lai/grazie/model/auth/GrazieAgentBase;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-auth"})
/*    */ public final class Serializer
/*    */   implements KSerializer<GrazieAgent>
/*    */ {
/*    */   @NotNull
/* 41 */   public static final Serializer INSTANCE = new Serializer(); @NotNull private static final KSerializer<GrazieAgentBase> baseSerializer = GrazieAgentBase.Companion.serializer();
/*    */   @NotNull
/* 43 */   private static final SerialDescriptor descriptor = baseSerializer.getDescriptor(); @NotNull public SerialDescriptor getDescriptor() { return descriptor; }
/*    */    @NotNull
/*    */   public GrazieAgent deserialize(@NotNull Decoder decoder) {
/* 46 */     Intrinsics.checkNotNullParameter(decoder, "decoder"); GrazieAgentBase agentBase = (GrazieAgentBase)baseSerializer.deserialize(decoder);
/* 47 */     return new GrazieAgent(agentBase.getName(), agentBase.getVersion());
/*    */   }
/*    */   
/*    */   public void serialize(@NotNull Encoder encoder, @NotNull GrazieAgent value) {
/* 51 */     Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); Intrinsics.checkNotNullExpressionValue(value.getName().toLowerCase(Locale.ROOT), "toLowerCase(...)"); baseSerializer.serialize(encoder, new GrazieAgentBase(value.getName().toLowerCase(Locale.ROOT), value.getVersion()));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-auth-jvm-0.4.32.jar!\ai\grazie\model\auth\GrazieAgent$Serializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */