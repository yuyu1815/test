/*     */ package ai.grazie.user.cfg.model;
/*     */ 
/*     */ import ai.grazie.user.cfg.model.proxy.AttributeCustomProxy;
/*     */ import ai.grazie.utils.attributes.Attributes;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\"\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\032,\020\003\032\b\022\004\022\002H\0050\004\"\b\b\000\020\005*\0020\0062\006\020\007\032\0020\b2\f\020\t\032\b\022\004\022\002H\0050\n\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\001XT¢\006\002\n\000¨\006\013"}, d2 = {"SHORTCUT_ARRAY_MAX_LENGTH", "", "SHORTCUT_MAX_LENGTH", "customProxy", "Lai/grazie/user/cfg/model/proxy/AttributeCustomProxy;", "T", "", "key", "Lai/grazie/utils/attributes/Attributes$Key$Json;", "serializer", "Lkotlinx/serialization/KSerializer;", "user-cfg-model"})
/*     */ public final class ConfigurationKt
/*     */ {
/*     */   private static final int SHORTCUT_MAX_LENGTH = 200;
/*     */   private static final int SHORTCUT_ARRAY_MAX_LENGTH = 5000;
/*     */   
/*     */   @NotNull
/*     */   public static final <T> AttributeCustomProxy<T> customProxy(@NotNull Attributes.Key.Json key, @NotNull KSerializer serializer) {
/* 152 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(serializer, "serializer"); return new AttributeCustomProxy(key, serializer);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\user-cfg-model-jvm-0.4.32.jar!\ai\grazi\\user\cfg\model\ConfigurationKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */