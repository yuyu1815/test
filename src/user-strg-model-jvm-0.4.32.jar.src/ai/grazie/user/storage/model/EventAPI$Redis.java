/*    */ package ai.grazie.user.storage.model;
/*    */ 
/*    */ import ai.grazie.model.cloud.RedisAPI;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004XD¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/user/storage/model/EventAPI$Redis;", "Lai/grazie/model/cloud/RedisAPI;", "()V", "topic", "", "getTopic", "()Ljava/lang/String;", "user-strg-model"})
/*    */ public final class Redis implements RedisAPI {
/*    */   @NotNull
/* 10 */   public static final Redis INSTANCE = new Redis(); @NotNull private static final String topic = "user.strg.event.user.pubsub"; @NotNull public String getTopic() { return topic; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\user-strg-model-jvm-0.4.32.jar!\ai\grazi\\user\storage\model\EventAPI$Redis.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */