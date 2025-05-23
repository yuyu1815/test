/*     */ package ai.grazie.user.cfg.model;
/*     */ import ai.grazie.user.cfg.model.proxy.AttributeCustomProxy;
/*     */ import ai.grazie.user.cfg.model.proxy.AttributeCustomProxyWithDefault;
/*     */ import ai.grazie.user.cfg.model.proxy.AttributeIntProxyWithDefault;
/*     */ import ai.grazie.user.cfg.model.proxy.AttributeProxy;
/*     */ import ai.grazie.user.cfg.model.proxy.AttributeProxyWithDefault;
/*     */ import ai.grazie.user.cfg.model.utils.Shortcut;
/*     */ import ai.grazie.utils.attributes.Attributes;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000j\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\020\021\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\006\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\007\b'\030\0002\0020\001B\005¢\006\002\020\002J\026\020\003\032\b\022\004\022\0020\0050\0042\006\020\006\032\0020\007H\007J\036\020\003\032\b\022\004\022\0020\0050\b2\006\020\006\032\0020\0072\006\020\t\032\0020\005H\007J\024\020\003\032\b\022\004\022\0020\0050\0042\006\020\006\032\0020\nJ\036\020\003\032\b\022\004\022\0020\0050\b2\006\020\006\032\0020\n2\006\020\t\032\0020\005H\007J\034\020\013\032\016\022\n\022\b\022\004\022\0020\0050\r0\f2\006\020\006\032\0020\016H\007J/\020\013\032\016\022\n\022\b\022\004\022\0020\0050\r0\0172\006\020\006\032\0020\0162\f\020\t\032\b\022\004\022\0020\0050\rH\007¢\006\002\020\020J;\020\013\032\016\022\n\022\b\022\004\022\0020\0050\r0\0172\006\020\006\032\0020\n2\f\020\t\032\b\022\004\022\0020\0050\r2\n\b\002\020\021\032\004\030\0010\022H\007¢\006\002\020\023J+\020\013\032\016\022\n\022\b\022\004\022\0020\0050\r0\f2\006\020\006\032\0020\n2\n\b\002\020\021\032\004\030\0010\022¢\006\002\020\024J\026\020\025\032\b\022\004\022\0020\0260\0042\006\020\006\032\0020\027H\007J\036\020\025\032\b\022\004\022\0020\0260\b2\006\020\006\032\0020\0272\006\020\t\032\0020\026H\007J\024\020\025\032\b\022\004\022\0020\0260\0042\006\020\006\032\0020\nJ\036\020\025\032\b\022\004\022\0020\0260\b2\006\020\006\032\0020\n2\006\020\t\032\0020\026H\007J\034\020\030\032\016\022\n\022\b\022\004\022\0020\0260\r0\f2\006\020\006\032\0020\016H\007J/\020\030\032\016\022\n\022\b\022\004\022\0020\0260\r0\0172\006\020\006\032\0020\0162\f\020\t\032\b\022\004\022\0020\0260\rH\007¢\006\002\020\031J;\020\030\032\016\022\n\022\b\022\004\022\0020\0260\r0\0172\006\020\006\032\0020\n2\f\020\t\032\b\022\004\022\0020\0260\r2\n\b\002\020\021\032\004\030\0010\022H\007¢\006\002\020\032J+\020\030\032\016\022\n\022\b\022\004\022\0020\0260\r0\f2\006\020\006\032\0020\n2\n\b\002\020\021\032\004\030\0010\022¢\006\002\020\024J\020\020\033\032\0020\0342\006\020\006\032\0020\027H\007J\030\020\033\032\0020\0352\006\020\006\032\0020\0272\006\020\t\032\0020\022H\007J\016\020\033\032\0020\0342\006\020\006\032\0020\nJ\030\020\033\032\0020\0352\006\020\006\032\0020\n2\006\020\t\032\0020\022H\007J\034\020\036\032\016\022\n\022\b\022\004\022\0020\0220\r0\f2\006\020\006\032\0020\016H\007J/\020\036\032\016\022\n\022\b\022\004\022\0020\0220\r0\0172\006\020\006\032\0020\0162\f\020\t\032\b\022\004\022\0020\0220\rH\007¢\006\002\020\037J;\020\036\032\016\022\n\022\b\022\004\022\0020\0220\r0\0172\006\020\006\032\0020\n2\f\020\t\032\b\022\004\022\0020\0220\r2\n\b\002\020\021\032\004\030\0010\022H\007¢\006\002\020 J+\020\036\032\016\022\n\022\b\022\004\022\0020\0220\r0\f2\006\020\006\032\0020\n2\n\b\002\020\021\032\004\030\0010\022¢\006\002\020\024J\026\020!\032\b\022\004\022\0020\"0\f2\006\020\006\032\0020\016H\007J\036\020!\032\b\022\004\022\0020\"0\0172\006\020\006\032\0020\0162\006\020\t\032\0020\"H\007J\024\020!\032\b\022\004\022\0020\"0\f2\006\020\006\032\0020\nJ\036\020!\032\b\022\004\022\0020\"0\0172\006\020\006\032\0020\n2\006\020\t\032\0020\"H\007J\034\020#\032\016\022\n\022\b\022\004\022\0020\"0\r0\f2\006\020\006\032\0020\016H\007J/\020#\032\016\022\n\022\b\022\004\022\0020\"0\r0\0172\006\020\006\032\0020\0162\f\020\t\032\b\022\004\022\0020\"0\rH\007¢\006\002\020$J\032\020#\032\016\022\n\022\b\022\004\022\0020\"0\r0\f2\006\020\006\032\0020\nJ/\020#\032\016\022\n\022\b\022\004\022\0020\"0\r0\0172\006\020\006\032\0020\n2\f\020\t\032\b\022\004\022\0020\"0\rH\007¢\006\002\020%J\026\020&\032\b\022\004\022\0020\n0\0042\006\020\006\032\0020'H\007J\036\020&\032\b\022\004\022\0020\n0\b2\006\020\006\032\0020'2\006\020\t\032\0020\nH\007J%\020&\032\b\022\004\022\0020\n0\0042\006\020\006\032\0020\n2\n\b\002\020(\032\004\030\0010\022¢\006\002\020)J/\020&\032\b\022\004\022\0020\n0\b2\006\020\006\032\0020\n2\006\020\t\032\0020\n2\n\b\002\020(\032\004\030\0010\022H\007¢\006\002\020*J\034\020+\032\016\022\n\022\b\022\004\022\0020\n0\r0\f2\006\020\006\032\0020\016H\007J/\020+\032\016\022\n\022\b\022\004\022\0020\n0\r0\0172\006\020\006\032\0020\0162\f\020\t\032\b\022\004\022\0020\n0\rH\007¢\006\002\020,J;\020+\032\016\022\n\022\b\022\004\022\0020\n0\r0\0172\006\020\006\032\0020\n2\f\020\t\032\b\022\004\022\0020\n0\r2\n\b\002\020\021\032\004\030\0010\022H\007¢\006\002\020-J+\020+\032\016\022\n\022\b\022\004\022\0020\n0\r0\f2\006\020\006\032\0020\n2\n\b\002\020\021\032\004\030\0010\022¢\006\002\020\024¨\006."}, d2 = {"Lai/grazie/user/cfg/model/Configuration;", "", "()V", "bool", "Lai/grazie/user/cfg/model/proxy/AttributeProxy;", "", "key", "Lai/grazie/utils/attributes/Attributes$Key$Bool;", "Lai/grazie/user/cfg/model/proxy/AttributeProxyWithDefault;", "default", "", "bools", "Lai/grazie/user/cfg/model/proxy/AttributeCustomProxy;", "", "Lai/grazie/utils/attributes/Attributes$Key$Json;", "Lai/grazie/user/cfg/model/proxy/AttributeCustomProxyWithDefault;", "(Lai/grazie/utils/attributes/Attributes$Key$Json;[Ljava/lang/Boolean;)Lai/grazie/user/cfg/model/proxy/AttributeCustomProxyWithDefault;", "maxSerializedArrayLength", "", "(Ljava/lang/String;[Ljava/lang/Boolean;Ljava/lang/Integer;)Lai/grazie/user/cfg/model/proxy/AttributeCustomProxyWithDefault;", "(Ljava/lang/String;Ljava/lang/Integer;)Lai/grazie/user/cfg/model/proxy/AttributeCustomProxy;", "double", "", "Lai/grazie/utils/attributes/Attributes$Key$Double;", "doubles", "(Lai/grazie/utils/attributes/Attributes$Key$Json;[Ljava/lang/Double;)Lai/grazie/user/cfg/model/proxy/AttributeCustomProxyWithDefault;", "(Ljava/lang/String;[Ljava/lang/Double;Ljava/lang/Integer;)Lai/grazie/user/cfg/model/proxy/AttributeCustomProxyWithDefault;", "number", "Lai/grazie/user/cfg/model/proxy/AttributeIntProxy;", "Lai/grazie/user/cfg/model/proxy/AttributeIntProxyWithDefault;", "numbers", "(Lai/grazie/utils/attributes/Attributes$Key$Json;[Ljava/lang/Integer;)Lai/grazie/user/cfg/model/proxy/AttributeCustomProxyWithDefault;", "(Ljava/lang/String;[Ljava/lang/Integer;Ljava/lang/Integer;)Lai/grazie/user/cfg/model/proxy/AttributeCustomProxyWithDefault;", "shortcut", "Lai/grazie/user/cfg/model/utils/Shortcut;", "shortcuts", "(Lai/grazie/utils/attributes/Attributes$Key$Json;[Lai/grazie/user/cfg/model/utils/Shortcut;)Lai/grazie/user/cfg/model/proxy/AttributeCustomProxyWithDefault;", "(Ljava/lang/String;[Lai/grazie/user/cfg/model/utils/Shortcut;)Lai/grazie/user/cfg/model/proxy/AttributeCustomProxyWithDefault;", "text", "Lai/grazie/utils/attributes/Attributes$Key$Text;", "maxLength", "(Ljava/lang/String;Ljava/lang/Integer;)Lai/grazie/user/cfg/model/proxy/AttributeProxy;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lai/grazie/user/cfg/model/proxy/AttributeProxyWithDefault;", "texts", "(Lai/grazie/utils/attributes/Attributes$Key$Json;[Ljava/lang/String;)Lai/grazie/user/cfg/model/proxy/AttributeCustomProxyWithDefault;", "(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/Integer;)Lai/grazie/user/cfg/model/proxy/AttributeCustomProxyWithDefault;", "user-cfg-model"})
/*     */ @SourceDebugExtension({"SMAP\nConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Configuration.kt\nai/grazie/user/cfg/model/Configuration\n+ 2 BuiltinSerializers.kt\nkotlinx/serialization/builtins/BuiltinSerializersKt\n*L\n1#1,153:1\n194#2:154\n194#2:155\n194#2:156\n194#2:157\n194#2:158\n194#2:159\n194#2:160\n194#2:161\n194#2:162\n194#2:163\n*S KotlinDebug\n*F\n+ 1 Configuration.kt\nai/grazie/user/cfg/model/Configuration\n*L\n36#1:154\n44#1:155\n61#1:156\n69#1:157\n87#1:158\n95#1:159\n114#1:160\n122#1:161\n140#1:162\n148#1:163\n*E\n"})
/*     */ public abstract class Configuration {
/*     */   @NotNull
/*     */   public final AttributeIntProxy number(@NotNull String key) {
/*  21 */     Intrinsics.checkNotNullParameter(key, "key"); return number(new Attributes.Key.Double(key));
/*     */   } @NotNull
/*     */   public final AttributeIntProxy number(@NotNull Attributes.Key.Double key) {
/*  24 */     Intrinsics.checkNotNullParameter(key, "key"); return new AttributeIntProxy(key);
/*     */   } @NotNull
/*     */   public final AttributeIntProxyWithDefault number(@NotNull String key, int default) {
/*  27 */     Intrinsics.checkNotNullParameter(key, "key"); return number(new Attributes.Key.Double(key), default);
/*     */   } @NotNull
/*     */   public final AttributeIntProxyWithDefault number(@NotNull Attributes.Key.Double key, int default) {
/*  30 */     Intrinsics.checkNotNullParameter(key, "key"); return new AttributeIntProxyWithDefault(key, default);
/*     */   } @NotNull
/*     */   public final AttributeCustomProxy<Integer[]> numbers(@NotNull String key, @Nullable Integer maxSerializedArrayLength) {
/*  33 */     Intrinsics.checkNotNullParameter(key, "key"); return numbers(new Attributes.Key.Json(key, maxSerializedArrayLength));
/*     */   }
/*     */   @NotNull
/*  36 */   public final AttributeCustomProxy<Integer[]> numbers(@NotNull Attributes.Key.Json key) { Intrinsics.checkNotNullParameter(key, "key"); KSerializer elementSerializer$iv = BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE); int $i$f$ArraySerializer = 0; return new AttributeCustomProxy(key, 
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
/* 154 */         BuiltinSerializersKt.ArraySerializer(Reflection.getOrCreateKotlinClass(Integer.class), elementSerializer$iv)); } @NotNull public final AttributeCustomProxyWithDefault<Integer[]> numbers(@NotNull String key, @NotNull Integer[] default, @Nullable Integer maxSerializedArrayLength) { Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(default, "default"); return numbers(new Attributes.Key.Json(key, maxSerializedArrayLength), default); }
/* 155 */   @NotNull public final AttributeCustomProxyWithDefault<Integer[]> numbers(@NotNull Attributes.Key.Json key, @NotNull Integer[] default) { Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(default, "default"); KSerializer elementSerializer$iv = BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE); int $i$f$ArraySerializer = 0; return new AttributeCustomProxyWithDefault(key, default, BuiltinSerializersKt.ArraySerializer(Reflection.getOrCreateKotlinClass(Integer.class), elementSerializer$iv)); }
/* 156 */   @NotNull public final AttributeProxy<String> text(@NotNull String key, @Nullable Integer maxLength) { Intrinsics.checkNotNullParameter(key, "key"); return text(new Attributes.Key.Text(key, maxLength)); } @NotNull public final AttributeProxy<String> text(@NotNull Attributes.Key.Text key) { Intrinsics.checkNotNullParameter(key, "key"); return new AttributeProxy((Attributes.Key)key); } @NotNull public final AttributeCustomProxy<String[]> texts(@NotNull Attributes.Key.Json key) { Intrinsics.checkNotNullParameter(key, "key"); KSerializer elementSerializer$iv = BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE); int $i$f$ArraySerializer = 0; return new AttributeCustomProxy(key, BuiltinSerializersKt.ArraySerializer(Reflection.getOrCreateKotlinClass(String.class), elementSerializer$iv)); }
/* 157 */   @NotNull public final AttributeProxyWithDefault<String> text(@NotNull String key, @NotNull String default, @Nullable Integer maxLength) { Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(default, "default"); return text(new Attributes.Key.Text(key, maxLength), default); } @NotNull public final AttributeProxyWithDefault<String> text(@NotNull Attributes.Key.Text key, @NotNull String default) { Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(default, "default"); return new AttributeProxyWithDefault((Attributes.Key)key, default); } @NotNull public final AttributeCustomProxy<String[]> texts(@NotNull String key, @Nullable Integer maxSerializedArrayLength) { Intrinsics.checkNotNullParameter(key, "key"); return texts(new Attributes.Key.Json(key, maxSerializedArrayLength)); } @NotNull public final AttributeCustomProxyWithDefault<String[]> texts(@NotNull String key, @NotNull String[] default, @Nullable Integer maxSerializedArrayLength) { Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(default, "default"); return texts(new Attributes.Key.Json(key, maxSerializedArrayLength), default); } @NotNull public final AttributeCustomProxyWithDefault<String[]> texts(@NotNull Attributes.Key.Json key, @NotNull String[] default) { Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(default, "default"); KSerializer elementSerializer$iv = BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE); int $i$f$ArraySerializer = 0; return new AttributeCustomProxyWithDefault(key, default, BuiltinSerializersKt.ArraySerializer(Reflection.getOrCreateKotlinClass(String.class), elementSerializer$iv)); } @NotNull public final AttributeProxy<Double> double(@NotNull String key) { Intrinsics.checkNotNullParameter(key, "key"); return double(new Attributes.Key.Double(key)); } @NotNull public final AttributeProxy<Double> double(@NotNull Attributes.Key.Double key) { Intrinsics.checkNotNullParameter(key, "key"); return new AttributeProxy((Attributes.Key)key); } @NotNull public final AttributeProxyWithDefault<Double> double(@NotNull String key, double default) { Intrinsics.checkNotNullParameter(key, "key"); return double(new Attributes.Key.Double(key), default); } @NotNull public final AttributeProxyWithDefault<Double> double(@NotNull Attributes.Key.Double key, double default) { Intrinsics.checkNotNullParameter(key, "key"); return new AttributeProxyWithDefault((Attributes.Key)key, Double.valueOf(default)); } @NotNull public final AttributeCustomProxy<Double[]> doubles(@NotNull String key, @Nullable Integer maxSerializedArrayLength) { Intrinsics.checkNotNullParameter(key, "key"); return doubles(new Attributes.Key.Json(key, maxSerializedArrayLength)); }
/* 158 */   @NotNull public final AttributeCustomProxy<Double[]> doubles(@NotNull Attributes.Key.Json key) { Intrinsics.checkNotNullParameter(key, "key"); KSerializer elementSerializer$iv = BuiltinSerializersKt.serializer(DoubleCompanionObject.INSTANCE); int $i$f$ArraySerializer = 0; return new AttributeCustomProxy(key, BuiltinSerializersKt.ArraySerializer(Reflection.getOrCreateKotlinClass(Double.class), elementSerializer$iv)); } @NotNull public final AttributeCustomProxyWithDefault<Double[]> doubles(@NotNull String key, @NotNull Double[] default, @Nullable Integer maxSerializedArrayLength) { Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(default, "default"); return doubles(new Attributes.Key.Json(key, maxSerializedArrayLength), default); }
/* 159 */   @NotNull public final AttributeCustomProxyWithDefault<Double[]> doubles(@NotNull Attributes.Key.Json key, @NotNull Double[] default) { Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(default, "default"); KSerializer elementSerializer$iv = BuiltinSerializersKt.serializer(DoubleCompanionObject.INSTANCE); int $i$f$ArraySerializer = 0; return new AttributeCustomProxyWithDefault(key, default, BuiltinSerializersKt.ArraySerializer(Reflection.getOrCreateKotlinClass(Double.class), elementSerializer$iv)); } @NotNull public final AttributeProxy<Boolean> bool(@NotNull String key) { Intrinsics.checkNotNullParameter(key, "key"); return bool(new Attributes.Key.Bool(key)); } @NotNull public final AttributeProxy<Boolean> bool(@NotNull Attributes.Key.Bool key) { Intrinsics.checkNotNullParameter(key, "key"); return new AttributeProxy((Attributes.Key)key); } @NotNull public final AttributeProxyWithDefault<Boolean> bool(@NotNull String key, boolean default) { Intrinsics.checkNotNullParameter(key, "key"); return bool(new Attributes.Key.Bool(key), default); } @NotNull public final AttributeProxyWithDefault<Boolean> bool(@NotNull Attributes.Key.Bool key, boolean default) { Intrinsics.checkNotNullParameter(key, "key"); return new AttributeProxyWithDefault((Attributes.Key)key, Boolean.valueOf(default)); } @NotNull public final AttributeCustomProxy<Boolean[]> bools(@NotNull String key, @Nullable Integer maxSerializedArrayLength) { Intrinsics.checkNotNullParameter(key, "key"); return bools(new Attributes.Key.Json(key, maxSerializedArrayLength)); }
/* 160 */   @NotNull public final AttributeCustomProxy<Boolean[]> bools(@NotNull Attributes.Key.Json key) { Intrinsics.checkNotNullParameter(key, "key"); KSerializer elementSerializer$iv = BuiltinSerializersKt.serializer(BooleanCompanionObject.INSTANCE); int $i$f$ArraySerializer = 0; return new AttributeCustomProxy(key, BuiltinSerializersKt.ArraySerializer(Reflection.getOrCreateKotlinClass(Boolean.class), elementSerializer$iv)); } @NotNull public final AttributeCustomProxyWithDefault<Boolean[]> bools(@NotNull String key, @NotNull Boolean[] default, @Nullable Integer maxSerializedArrayLength) { Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(default, "default"); return bools(new Attributes.Key.Json(key, maxSerializedArrayLength), default); }
/* 161 */   @NotNull public final AttributeCustomProxyWithDefault<Boolean[]> bools(@NotNull Attributes.Key.Json key, @NotNull Boolean[] default) { Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(default, "default"); KSerializer elementSerializer$iv = BuiltinSerializersKt.serializer(BooleanCompanionObject.INSTANCE); int $i$f$ArraySerializer = 0; return new AttributeCustomProxyWithDefault(key, default, BuiltinSerializersKt.ArraySerializer(Reflection.getOrCreateKotlinClass(Boolean.class), elementSerializer$iv)); } @NotNull public final AttributeCustomProxy<Shortcut> shortcut(@NotNull String key) { Intrinsics.checkNotNullParameter(key, "key"); return shortcut(new Attributes.Key.Json(key, Integer.valueOf(200))); } @NotNull public final AttributeCustomProxy<Shortcut> shortcut(@NotNull Attributes.Key.Json key) { Intrinsics.checkNotNullParameter(key, "key"); return new AttributeCustomProxy(key, Shortcut.Companion.serializer()); } @NotNull public final AttributeCustomProxyWithDefault<Shortcut> shortcut(@NotNull String key, @NotNull Shortcut default) { Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(default, "default"); return shortcut(new Attributes.Key.Json(key, Integer.valueOf(200)), default); } @NotNull public final AttributeCustomProxyWithDefault<Shortcut> shortcut(@NotNull Attributes.Key.Json key, @NotNull Shortcut default) { Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(default, "default"); return new AttributeCustomProxyWithDefault(key, default, Shortcut.Companion.serializer()); } @NotNull public final AttributeCustomProxy<Shortcut[]> shortcuts(@NotNull String key) { Intrinsics.checkNotNullParameter(key, "key"); return shortcuts(new Attributes.Key.Json(key, Integer.valueOf(5000))); }
/* 162 */   @NotNull public final AttributeCustomProxy<Shortcut[]> shortcuts(@NotNull Attributes.Key.Json key) { Intrinsics.checkNotNullParameter(key, "key"); KSerializer elementSerializer$iv = Shortcut.Companion.serializer(); int $i$f$ArraySerializer = 0; return new AttributeCustomProxy(key, BuiltinSerializersKt.ArraySerializer(Reflection.getOrCreateKotlinClass(Shortcut.class), elementSerializer$iv)); } @NotNull public final AttributeCustomProxyWithDefault<Shortcut[]> shortcuts(@NotNull String key, @NotNull Shortcut[] default) { Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(default, "default"); return shortcuts(new Attributes.Key.Json(key, Integer.valueOf(5000)), default); }
/* 163 */   @NotNull public final AttributeCustomProxyWithDefault<Shortcut[]> shortcuts(@NotNull Attributes.Key.Json key, @NotNull Shortcut[] default) { Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(default, "default"); KSerializer elementSerializer$iv = Shortcut.Companion.serializer(); int $i$f$ArraySerializer = 0; return new AttributeCustomProxyWithDefault(key, default, BuiltinSerializersKt.ArraySerializer(Reflection.getOrCreateKotlinClass(Shortcut.class), elementSerializer$iv)); }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\user-cfg-model-jvm-0.4.32.jar!\ai\grazi\\user\cfg\model\Configuration.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */