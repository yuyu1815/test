/*    */ package ai.grazie.auth.model.events;
/*    */ 
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import ai.grazie.utils.mpp.UUID;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.NoWhenBranchMatchedException;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\"\025\020\000\032\0020\001*\0020\0028F¢\006\006\032\004\b\003\020\004\"\025\020\005\032\0020\006*\0020\0028F¢\006\006\032\004\b\007\020\b¨\006\t"}, d2 = {"id", "Lai/grazie/utils/mpp/UUID;", "Lai/grazie/auth/model/events/UserAttributeEvent;", "getId", "(Lai/grazie/auth/model/events/UserAttributeEvent;)Lai/grazie/utils/mpp/UUID;", "key", "Lai/grazie/utils/attributes/Attributes$Key;", "getKey", "(Lai/grazie/auth/model/events/UserAttributeEvent;)Lai/grazie/utils/attributes/Attributes$Key;", "auth-model"})
/*    */ public final class UserAttributeEventKt
/*    */ {
/*    */   @NotNull
/*    */   public static final UUID getId(@NotNull UserAttributeEvent $this$id) {
/* 36 */     Intrinsics.checkNotNullParameter($this$id, "<this>"); UserAttributeEvent userAttributeEvent = $this$id;
/*    */ 
/*    */     
/* 39 */     if (userAttributeEvent instanceof UserAttributeEvent.Updated) {  } else { throw new NoWhenBranchMatchedException(); }
/*    */     
/*    */     return (userAttributeEvent instanceof UserAttributeEvent.Created) ? ((UserAttributeEvent.Created)$this$id).getId() : ((userAttributeEvent instanceof UserAttributeEvent.Deleted) ? ((UserAttributeEvent.Deleted)$this$id).getId() : (UUID)"JD-Core does not support Kotlin");
/*    */   } @NotNull
/*    */   public static final Attributes.Key getKey(@NotNull UserAttributeEvent $this$key) {
/* 44 */     Intrinsics.checkNotNullParameter($this$key, "<this>"); UserAttributeEvent userAttributeEvent = $this$key;
/*    */ 
/*    */     
/* 47 */     if (userAttributeEvent instanceof UserAttributeEvent.Updated) {  } else { throw new NoWhenBranchMatchedException(); }
/*    */     
/*    */     return (userAttributeEvent instanceof UserAttributeEvent.Created) ? ((UserAttributeEvent.Created)$this$key).getKey() : ((userAttributeEvent instanceof UserAttributeEvent.Deleted) ? ((UserAttributeEvent.Deleted)$this$key).getKey() : (Attributes.Key)"JD-Core does not support Kotlin");
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-model-jvm-0.4.32.jar!\ai\grazie\auth\model\events\UserAttributeEventKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */