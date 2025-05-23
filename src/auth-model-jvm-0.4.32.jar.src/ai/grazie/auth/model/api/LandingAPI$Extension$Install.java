/*    */ package ai.grazie.auth.model.api;
/*    */ 
/*    */ import ai.grazie.model.cloud.HttpMethod;
/*    */ import ai.grazie.model.cloud.TypeInfo;
/*    */ import ai.grazie.model.cloud.UnitTypedApi;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.reflect.KType;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\bÆ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\006\020\007R\024\020\b\032\0020\tXD¢\006\b\n\000\032\004\b\n\020\013R\032\020\f\032\b\022\004\022\0020\0020\rX\004¢\006\b\n\000\032\004\b\016\020\017¨\006\020"}, d2 = {"Lai/grazie/auth/model/api/LandingAPI$Extension$Install;", "Lai/grazie/model/cloud/UnitTypedApi;", "", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "responseType", "Lai/grazie/model/cloud/TypeInfo;", "getResponseType", "()Lai/grazie/model/cloud/TypeInfo;", "auth-model"})
/*    */ @SourceDebugExtension({"SMAP\nLanding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Landing.kt\nai/grazie/auth/model/api/LandingAPI$Extension$Install\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,26:1\n19#2,2:27\n*S KotlinDebug\n*F\n+ 1 Landing.kt\nai/grazie/auth/model/api/LandingAPI$Extension$Install\n*L\n22#1:27,2\n*E\n"})
/*    */ public final class Install
/*    */   implements UnitTypedApi<Unit>
/*    */ {
/*    */   @NotNull
/* 20 */   public static final Install INSTANCE = new Install(); @NotNull private static final String path = "/browser-extension/install"; @NotNull public String getPath() { return path; } @NotNull private static final TypeInfo<Unit> responseType; @NotNull
/* 21 */   private static final HttpMethod httpMethod = HttpMethod.Get; @NotNull public HttpMethod getHttpMethod() { return httpMethod; } @NotNull
/* 22 */   public TypeInfo<Unit> getResponseType() { return responseType; } static { int $i$f$typeInfo = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 27 */     KType kType$iv = Reflection.typeOf(Unit.class);
/* 28 */     responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Unit.class)); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-model-jvm-0.4.32.jar!\ai\grazie\auth\model\api\LandingAPI$Extension$Install.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */